package com.hjjc.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: Company
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
 */
public class Company implements Serializable {
    /**
     * Column: Company.companyID
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyID;

    /**
     * Column: Company.companyName
    @mbggenerated 2018-03-27 16:27:29
     */
    private String companyName;

    /**
     * Column: Company.divisions
    @mbggenerated 2018-03-27 16:27:29
     */
    private String divisions;

    /**
     * Column: Company.jd
    @mbggenerated 2018-03-27 16:27:29
     */
    private String jd;

    /**
     * Column: Company.wd
    @mbggenerated 2018-03-27 16:27:29
     */
    private String wd;

    /**
     * Table: Company
    @mbggenerated 2018-03-27 16:27:29
     */
    private static final long serialVersionUID = 1L;

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID == null ? null : companyID.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getDivisions() {
        return divisions;
    }

    public void setDivisions(String divisions) {
        this.divisions = divisions == null ? null : divisions.trim();
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd == null ? null : jd.trim();
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd == null ? null : wd.trim();
    }
}