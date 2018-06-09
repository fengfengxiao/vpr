package com.hjjc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: HistoryData
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
 */
public class HistoryDataKey implements Serializable {
    /**
     * Column: HistoryData.DeviceID
    @mbggenerated 2018-03-27 16:27:30
     */
    private String deviceID;

    /**
     * Column: HistoryData.DataTime_Hour
    @mbggenerated 2018-03-27 16:27:30
     */
    private Date dataTime_Hour;

    /**
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
     */
    private static final long serialVersionUID = 1L;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID == null ? null : deviceID.trim();
    }

    public Date getDataTime_Hour() {
        return dataTime_Hour;
    }

    public void setDataTime_Hour(Date dataTime_Hour) {
        this.dataTime_Hour = dataTime_Hour;
    }
}