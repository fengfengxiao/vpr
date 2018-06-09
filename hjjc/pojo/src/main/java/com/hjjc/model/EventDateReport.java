package com.hjjc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: EventDateReport
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
 */
public class EventDateReport implements Serializable {
    /**
     * Column: EventDateReport.id
    @mbggenerated 2018-03-27 16:27:29
     */
    private Integer id;

    /**
     * Column: EventDateReport.DeviceID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String deviceID;

    /**
     * Column: EventDateReport.DateTime
    @mbggenerated 2018-03-27 16:27:29
     */
    private Date dateTime;

    /**
     * Column: EventDateReport.Confirmed
    @mbggenerated 2018-03-27 16:27:29
     */
    private String confirmed;

    /**
     * Column: EventDateReport.Memo
    @mbggenerated 2018-03-27 16:27:29
     */
    private String memo;

    /**
     * Column: EventDateReport.EventCode
    @mbggenerated 2018-03-27 16:27:29
     */
    private Integer eventCode;

    /**
     * Column: EventDateReport.CompanyID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyID;

    /**
     * Column: EventDateReport.EventType
    @mbggenerated 2018-03-27 16:27:29
     */
    private Integer eventType;

    /**
     * Table: EventDateReport
    @mbggenerated 2018-03-27 16:27:29
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID == null ? null : deviceID.trim();
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed == null ? null : confirmed.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getEventCode() {
        return eventCode;
    }

    public void setEventCode(Integer eventCode) {
        this.eventCode = eventCode;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID == null ? null : companyID.trim();
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }
}