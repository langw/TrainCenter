package com.huami.watch.train.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TrainRecord.
 */
public class TrainRecord {

    private Long id;
    private Integer trainType;
    private String trainTitle;
    private String copywriter;
    private Integer trainStatus;
    private java.util.Date startData;
    private java.util.Date endData;
    private Integer trainDays;

    public TrainRecord() {
    }

    public TrainRecord(Long id) {
        this.id = id;
    }

    public TrainRecord(Long id, Integer trainType, String trainTitle, String copywriter, Integer trainStatus, java.util.Date startData, java.util.Date endData, Integer trainDays) {
        this.id = id;
        this.trainType = trainType;
        this.trainTitle = trainTitle;
        this.copywriter = copywriter;
        this.trainStatus = trainStatus;
        this.startData = startData;
        this.endData = endData;
        this.trainDays = trainDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCopywriter() {
        return copywriter;
    }

    public void setCopywriter(String copywriter) {
        this.copywriter = copywriter;
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

}
