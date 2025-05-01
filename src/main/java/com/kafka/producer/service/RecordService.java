package com.kafka.producer.service;

import com.kafka.producer.entity.RecordEntity;
import com.kafka.producer.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository){
        this.recordRepository=recordRepository;
    }

    public List<RecordEntity> getAllRecords(){
        return recordRepository.findAll();
    }
}
