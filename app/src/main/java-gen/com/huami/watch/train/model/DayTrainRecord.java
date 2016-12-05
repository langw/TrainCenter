package com.huami.watch.train.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table DayTrainRecord.
 */
public class DayTrainRecord {

    private Long id;
    private Long trainRecordId;
    private Integer trainType;
    private Integer rateStart;
    private Integer rateEnd;
    private Integer offsetDays;
    private Integer dayTrainStatus;
    private Double distance;
    private Integer runremindId;
    private Integer swimTimeMin;
    private Integer swimTimeMax;

    public DayTrainRecord() {
    }

    public DayTrainRecord(Long id) {
        this.id = id;
    }

    public DayTrainRecord(Long id, Long trainRecordId, Integer trainType, Integer rateStart, Integer rateEnd, Integer offsetDays, Integer dayTrainStatus, Double distance, Integer runremindId, Integer swimTimeMin, Integer swimTimeMax) {
        this.id = id;
        this.trainRecordId = trainRecordId;
        this.trainType = trainType;
        this.rateStart = rateStart;
        this.rateEnd = rateEnd;
        this.offsetDays = offsetDays;
        this.dayTrainStatus = dayTrainStatus;
        this.distance = distance;
        this.runremindId = runremindId;
        this.swimTimeMin = swimTimeMin;
        this.swimTimeMax = swimTimeMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainRecordId() {
        return trainRecordId;
    }

    public void setTrainRecordId(Long trainRecordId) {
        this.trainRecordId = trainRecordId;
    }

    public Integer getTrainType() {
        return trainType;
    }

    public void setTrainType(Integer trainType) {
        this.trainType = trainType;
    }

    public Integer getRateStart() {
        return rateStart;
    }

    public void setRateStart(Integer rateStart) {
        this.rateStart = rateStart;
    }

    public Integer getRateEnd() {
        return rateEnd;
    }

    public void setRateEnd(Integer rateEnd) {
        this.rateEnd = rateEnd;
    }

    public Integer getOffsetDays() {
        return offsetDays;
    }

    public void setOffsetDays(Integer offsetDays) {
        this.offsetDays = offsetDays;
    }

    public Integer getDayTrainStatus() {
        return dayTrainStatus;
    }

    public void setDayTrainStatus(Integer dayTrainStatus) {
        this.dayTrainStatus = dayTrainStatus;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getRunremindId() {
        return runremindId;
    }

    public void setRunremindId(Integer runremindId) {
        this.runremindId = runremindId;
    }

    public Integer getSwimTimeMin() {
        return swimTimeMin;
    }

    public void setSwimTimeMin(Integer swimTimeMin) {
        this.swimTimeMin = swimTimeMin;
    }

    public Integer getSwimTimeMax() {
        return swimTimeMax;
    }

    public void setSwimTimeMax(Integer swimTimeMax) {
        this.swimTimeMax = swimTimeMax;
    }

}