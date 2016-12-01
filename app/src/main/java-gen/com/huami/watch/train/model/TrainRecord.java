package com.huami.watch.train.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TrainRecord.
 */
public class TrainRecord {

    private Long id;
    private Integer trainPlanId;
    private Integer trainType;
    private String trainTitle;
    private Integer trainStatus;
    private java.util.Date startData;
    private java.util.Date endData;
    private Integer trainDays;
    private Integer totalDays;
    private Double trainTotalLength;
    private Double totalLength;
    private Integer lastTrainOffsetDays;

    public TrainRecord() {
    }

    public TrainRecord(Long id) {
        this.id = id;
    }

    public TrainRecord(Long id, Integer trainPlanId, Integer trainType, String trainTitle, Integer trainStatus, java.util.Date startData, java.util.Date endData, Integer trainDays, Integer totalDays, Double trainTotalLength, Double totalLength, Integer lastTrainOffsetDays) {
        this.id = id;
        this.trainPlanId = trainPlanId;
        this.trainType = trainType;
        this.trainTitle = trainTitle;
        this.trainStatus = trainStatus;
        this.startData = startData;
        this.endData = endData;
        this.trainDays = trainDays;
        this.totalDays = totalDays;
        this.trainTotalLength = trainTotalLength;
        this.totalLength = totalLength;
        this.lastTrainOffsetDays = lastTrainOffsetDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTrainPlanId() {
        return trainPlanId;
    }

    public void setTrainPlanId(Integer trainPlanId) {
        this.trainPlanId = trainPlanId;
    }

    public Integer getTrainType() {
        return trainType;
    }

    public void setTrainType(Integer trainType) {
        this.trainType = trainType;
    }

    public String getTrainTitle() {
        return trainTitle;
    }

    public void setTrainTitle(String trainTitle) {
        this.trainTitle = trainTitle;
    }

    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    public java.util.Date getStartData() {
        return startData;
    }

    public void setStartData(java.util.Date startData) {
        this.startData = startData;
    }

    public java.util.Date getEndData() {
        return endData;
    }

    public void setEndData(java.util.Date endData) {
        this.endData = endData;
    }

    public Integer getTrainDays() {
        return trainDays;
    }

    public void setTrainDays(Integer trainDays) {
        this.trainDays = trainDays;
    }

    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public Double getTrainTotalLength() {
        return trainTotalLength;
    }

    public void setTrainTotalLength(Double trainTotalLength) {
        this.trainTotalLength = trainTotalLength;
    }

    public Double getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(Double totalLength) {
        this.totalLength = totalLength;
    }

    public Integer getLastTrainOffsetDays() {
        return lastTrainOffsetDays;
    }

    public void setLastTrainOffsetDays(Integer lastTrainOffsetDays) {
        this.lastTrainOffsetDays = lastTrainOffsetDays;
    }

}
