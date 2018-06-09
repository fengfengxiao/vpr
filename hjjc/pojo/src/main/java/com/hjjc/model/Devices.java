package com.hjjc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: Devices
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
 */
public class Devices implements Serializable {
    /**
     * Column: Devices.DeviceID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String deviceID;

    /**
     * Column: Devices.SetupDate
    @mbggenerated 2018-03-27 16:27:29
     */
    private String setupDate;

    /**
     * Column: Devices.DeviceName
    @mbggenerated 2018-03-27 16:27:29
     */
    private String deviceName;

    /**
     * Column: Devices.DivisionID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String divisionID;

    /**
     * Column: Devices.DeviceAddr
    @mbggenerated 2018-03-27 16:27:29
     */
    private String deviceAddr;

    /**
     * Column: Devices.CompanyName
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyName;

    /**
     * Column: Devices.DeviceType
    @mbggenerated 2018-03-27 16:27:29
     */
    private String deviceType;

    /**
     * Column: Devices.CompanyID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyID;

    /**
     * Column: Devices.phaseACurrent
    @mbggenerated 2018-03-27 16:27:29
     */
    private Double phaseACurrent;

    /**
     * Column: Devices.phaseBCurrent
    @mbggenerated 2018-03-27 16:27:29
     */
    private Double phaseBCurrent;

    /**
     * Column: Devices.phaseCCurrent
    @mbggenerated 2018-03-27 16:27:29
     */
    private Double phaseCCurrent;

    /**
     * Column: Devices.CTRatio
    @mbggenerated 2018-03-27 16:27:29
     */
    private Integer CTRatio;

    /**
     * Column: Devices.LastDataTime
    @mbggenerated 2018-03-27 16:27:29
     */
    private Date lastDataTime;

    /**
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    private static final long serialVersionUID = 1L;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID == null ? null : deviceID.trim();
    }

    public String getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(String setupDate) {
        this.setupDate = setupDate == null ? null : setupDate.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(String divisionID) {
        this.divisionID = divisionID == null ? null : divisionID.trim();
    }

    public String getDeviceAddr() {
        return deviceAddr;
    }

    public void setDeviceAddr(String deviceAddr) {
        this.deviceAddr = deviceAddr == null ? null : deviceAddr.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID == null ? null : companyID.trim();
    }

    public Double getPhaseACurrent() {
        return phaseACurrent;
    }

    public void setPhaseACurrent(Double phaseACurrent) {
        this.phaseACurrent = phaseACurrent;
    }

    public Double getPhaseBCurrent() {
        return phaseBCurrent;
    }

    public void setPhaseBCurrent(Double phaseBCurrent) {
        this.phaseBCurrent = phaseBCurrent;
    }

    public Double getPhaseCCurrent() {
        return phaseCCurrent;
    }

    public void setPhaseCCurrent(Double phaseCCurrent) {
        this.phaseCCurrent = phaseCCurrent;
    }

    public Integer getCTRatio() {
        return CTRatio;
    }

    public void setCTRatio(Integer CTRatio) {
        this.CTRatio = CTRatio;
    }

    public Date getLastDataTime() {
        return lastDataTime;
    }

    public void setLastDataTime(Date lastDataTime) {
        this.lastDataTime = lastDataTime;
    }
}