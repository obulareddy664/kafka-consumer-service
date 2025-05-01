package com.kafka.producer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class RecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recordEntity;

    private BigInteger id;

    private String name;

    private String competetior;

    private Double conversionFactor;

    private BigInteger fileId;

    private Double price;

    public RecordEntity(){}

    public RecordEntity(Double price, BigInteger fileId, Double conversionFactor, String competetior, String name, BigInteger id, Integer recordEntity) {
        this.price = price;
        this.fileId = fileId;
        this.conversionFactor = conversionFactor;
        this.competetior = competetior;
        this.name = name;
        this.id = id;
        this.recordEntity = recordEntity;
    }

    public Integer getRecordEntity() {
        return recordEntity;
    }

    public void setRecordEntity(Integer recordEntity) {
        this.recordEntity = recordEntity;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetetior() {
        return competetior;
    }

    public void setCompetetior(String competetior) {
        this.competetior = competetior;
    }

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigInteger getFileId() {
        return fileId;
    }

    public void setFileId(BigInteger fileId) {
        this.fileId = fileId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
