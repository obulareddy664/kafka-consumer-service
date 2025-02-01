package com.kafka.producer.model;



import java.math.BigInteger;



public class RecordEntity {


    private BigInteger id;

    private String name;

    private String competetior;

    private Double conversionFactor;

    private BigInteger fileId;

    private Double price;



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

    @Override
    public String toString() {
        return "RecordEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", competetior='" + competetior + '\'' +
                ", conversionFactor=" + conversionFactor +
                ", fileId=" + fileId +
                ", price=" + price +
                '}';
    }
}
