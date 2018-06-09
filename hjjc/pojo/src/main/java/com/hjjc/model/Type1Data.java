package com.hjjc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: Type1Data
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
 */
public class Type1Data implements Serializable {
    /**
     * Column: Type1Data.DeviceID
    @mbggenerated 2018-03-27 16:27:30
     */
    private String deviceID;

    /**
     * Column: Type1Data.DataTime
    @mbggenerated 2018-03-27 16:27:30
     */
    private Date dataTime;

    /**
     * Column: Type1Data.Current_A
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double current_A;

    /**
     * Column: Type1Data.Current_B
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double current_B;

    /**
     * Column: Type1Data.Current_C
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double current_C;

    /**
     * Column: Type1Data.VoltA
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double voltA;

    /**
     * Column: Type1Data.VoltB
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double voltB;

    /**
     * Column: Type1Data.VoltC
    @mbggenerated 2018-03-27 16:27:30
     */
    private Double voltC;

    /**
     * Column: Type1Data.isAvailable
    @mbggenerated 2018-03-27 16:27:30
     */
    private Boolean isAvailable;

    /**
     * Column: Type1Data.isCalculate
    @mbggenerated 2018-03-27 16:27:30
     */
    private Boolean isCalculate;

    /**
     * Table: Type1Data
    @mbggenerated 2018-03-27 16:27:30
     */
    private static final long serialVersionUID = 1L;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID == null ? null : deviceID.trim();
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Double getCurrent_A() {
        return current_A;
    }

    public void setCurrent_A(Double current_A) {
        this.current_A = current_A;
    }

    public Double getCurrent_B() {
        return current_B;
    }

    public void setCurrent_B(Double current_B) {
        this.current_B = current_B;
    }

    public Double getCurrent_C() {
        return current_C;
    }

    public void setCurrent_C(Double current_C) {
        this.current_C = current_C;
    }

    public Double getVoltA() {
        return voltA;
    }

    public void setVoltA(Double voltA) {
        this.voltA = voltA;
    }

    public Double getVoltB() {
        return voltB;
    }

    public void setVoltB(Double voltB) {
        this.voltB = voltB;
    }

    public Double getVoltC() {
        return voltC;
    }

    public void setVoltC(Double voltC) {
        this.voltC = voltC;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsCalculate() {
        return isCalculate;
    }

    public void setIsCalculate(Boolean isCalculate) {
        this.isCalculate = isCalculate;
    }
}