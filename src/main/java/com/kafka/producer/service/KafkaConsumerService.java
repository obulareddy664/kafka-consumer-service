package com.kafka.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.producer.entity.RecordEntity;
import com.kafka.producer.mapping.RecordMapper;
import com.kafka.producer.model.RecordDTO;
import com.kafka.producer.repository.RecordRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class KafkaConsumerService {

    private final ObjectMapper objectMapper;

    private final RecordRepository recordRepository;

    public KafkaConsumerService(ObjectMapper objectMapper, RecordRepository recordRepository) {
        this.objectMapper = objectMapper;
        this.recordRepository=recordRepository;
    }

    @KafkaListener(topics = "product", batch = "true")
    public void getMessage(List<RecordDTO> recordDTOs,Acknowledgment acknowledgment) throws JsonProcessingException {
        System.out.println("Received batch size: " + recordDTOs.size());

        // Process all records asynchronously and collect futures
        List<CompletableFuture<Void>> futures = recordDTOs.stream()
                .map(dto -> processAsync(dto))
                .toList();

        // When all futures complete, acknowledge the batch
        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    System.out.println("All records processed, acknowledging...");
                    acknowledgment.acknowledge();
                });
    }

    private CompletableFuture<Void> processAsync(RecordDTO recordDTO){

        return CompletableFuture.runAsync(() -> {
            // Simulate processing
            System.out.println("Processing: " + recordDTO);
            RecordEntity recordEntity=RecordMapper.RECORD_MAPPER.toRecordEntity(recordDTO);
                recordRepository.save(recordEntity);

        });
    }
}
