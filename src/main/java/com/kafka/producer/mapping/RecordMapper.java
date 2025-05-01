package com.kafka.producer.mapping;

import com.kafka.producer.entity.RecordEntity;
import com.kafka.producer.model.RecordDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecordMapper {

    RecordMapper RECORD_MAPPER = Mappers.getMapper(RecordMapper.class);

    RecordEntity toRecordEntity(RecordDTO recordDTO);
}
