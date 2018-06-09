package com.hjjc.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: DeviceRelations
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
 */
public class DeviceRelations implements Serializable {
    /**
     * Column: DeviceRelations.DR_id
    @mbggenerated 2018-03-27 16:27:29
     */
    private Integer DR_id;

    /**
     * Column: DeviceRelations.SCDeviceID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String SCDeviceID;

    /**
     * Column: DeviceRelations.HBDeviceID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String HBDeviceID;

    /**
     * Column: DeviceRelations.CompanyID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyID;

    /**
     * Table: DeviceRelations
    @mbggenerated 2018-03-27 16:27:29
     */
    private static final long serialVersionUID = 1L;

    public Integer getDR_id() {
        return DR_id;
    }

    public void setDR_id(Integer DR_id) {
        this.DR_id = DR_id;
    }

    public String getSCDeviceID() {
        return SCDeviceID;
    }

    public void setSCDeviceID(String SCDeviceID) {
        this.SCDeviceID = SCDeviceID == null ? null : SCDeviceID.trim();
    }

    public String getHBDeviceID() {
        return HBDeviceID;
    }

    public void setHBDeviceID(String HBDeviceID) {
        this.HBDeviceID = HBDeviceID == null ? null : HBDeviceID.trim();
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID == null ? null : companyID.trim();
    }
}