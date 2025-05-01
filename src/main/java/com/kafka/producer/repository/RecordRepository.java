package com.kafka.producer.repository;

import com.kafka.producer.entity.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity,Integer> {
}
