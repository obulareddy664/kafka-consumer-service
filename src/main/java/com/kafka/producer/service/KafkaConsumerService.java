package com.kafka.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.producer.model.RecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "product",groupId = "competetior-one")
    public void getMessage(String recordEntity) throws JsonProcessingException {
      RecordEntity recordEntity1=  objectMapper.readValue(recordEntity, RecordEntity.class);
      System.out.println("Record Entity"+recordEntity1);
    }
}
