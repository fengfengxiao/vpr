package com.hjjc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevicesCriteria {
    /**
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    protected String orderByClause;

    /**
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    protected boolean distinct;

    /**
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    protected List<Criteria> oredCriteria;

    public DevicesCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDeviceIDIsNull() {
            addCriterion("DeviceID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIsNotNull() {
            addCriterion("DeviceID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDEqualTo(String value) {
            addCriterion("DeviceID =", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotEqualTo(String value) {
            addCriterion("DeviceID <>", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThan(String value) {
            addCriterion("DeviceID >", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceID >=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThan(String value) {
            addCriterion("DeviceID <", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThanOrEqualTo(String value) {
            addCriterion("DeviceID <=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLike(String value) {
            addCriterion("DeviceID like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotLike(String value) {
            addCriterion("DeviceID not like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIn(List<String> values) {
            addCriterion("DeviceID in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotIn(List<String> values) {
            addCriterion("DeviceID not in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDBetween(String value1, String value2) {
            addCriterion("DeviceID between", value1, value2, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotBetween(String value1, String value2) {
            addCriterion("DeviceID not between", value1, value2, "deviceID");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNull() {
            addCriterion("SetupDate is null");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNotNull() {
            addCriterion("SetupDate is not null");
            return (Criteria) this;
        }

        public Criteria andSetupDateEqualTo(String value) {
            addCriterion("SetupDate =", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotEqualTo(String value) {
            addCriterion("SetupDate <>", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThan(String value) {
            addCriterion("SetupDate >", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThanOrEqualTo(String value) {
            addCriterion("SetupDate >=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThan(String value) {
            addCriterion("SetupDate <", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThanOrEqualTo(String value) {
            addCriterion("SetupDate <=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLike(String value) {
            addCriterion("SetupDate like", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotLike(String value) {
            addCriterion("SetupDate not like", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateIn(List<String> values) {
            addCriterion("SetupDate in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotIn(List<String> values) {
            addCriterion("SetupDate not in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateBetween(String value1, String value2) {
            addCriterion("SetupDate between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotBetween(String value1, String value2) {
            addCriterion("SetupDate not between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("DeviceName is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("DeviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("DeviceName =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("DeviceName <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("DeviceName >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceName >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("DeviceName <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("DeviceName <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("DeviceName like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("DeviceName not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("DeviceName in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("DeviceName not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("DeviceName between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("DeviceName not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDivisionIDIsNull() {
            addCriterion("DivisionID is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIDIsNotNull() {
            addCriterion("DivisionID is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionIDEqualTo(String value) {
            addCriterion("DivisionID =", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDNotEqualTo(String value) {
            addCriterion("DivisionID <>", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDGreaterThan(String value) {
            addCriterion("DivisionID >", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDGreaterThanOrEqualTo(String value) {
            addCriterion("DivisionID >=", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDLessThan(String value) {
            addCriterion("DivisionID <", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDLessThanOrEqualTo(String value) {
            addCriterion("DivisionID <=", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDLike(String value) {
            addCriterion("DivisionID like", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDNotLike(String value) {
            addCriterion("DivisionID not like", value, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDIn(List<String> values) {
            addCriterion("DivisionID in", values, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDNotIn(List<String> values) {
            addCriterion("DivisionID not in", values, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDBetween(String value1, String value2) {
            addCriterion("DivisionID between", value1, value2, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDivisionIDNotBetween(String value1, String value2) {
            addCriterion("DivisionID not between", value1, value2, "divisionID");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNull() {
            addCriterion("DeviceAddr is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNotNull() {
            addCriterion("DeviceAddr is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrEqualTo(String value) {
            addCriterion("DeviceAddr =", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotEqualTo(String value) {
            addCriterion("DeviceAddr <>", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThan(String value) {
            addCriterion("DeviceAddr >", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceAddr >=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThan(String value) {
            addCriterion("DeviceAddr <", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThanOrEqualTo(String value) {
            addCriterion("DeviceAddr <=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLike(String value) {
            addCriterion("DeviceAddr like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotLike(String value) {
            addCriterion("DeviceAddr not like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIn(List<String> values) {
            addCriterion("DeviceAddr in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotIn(List<String> values) {
            addCriterion("DeviceAddr not in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrBetween(String value1, String value2) {
            addCriterion("DeviceAddr between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotBetween(String value1, String value2) {
            addCriterion("DeviceAddr not between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("CompanyName like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DeviceType is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DeviceType is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DeviceType =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DeviceType <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DeviceType >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceType >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DeviceType <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DeviceType <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DeviceType like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DeviceType not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DeviceType in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DeviceType not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DeviceType between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DeviceType not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDEqualTo(String value) {
            addCriterion("CompanyID =", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotEqualTo(String value) {
            addCriterion("CompanyID <>", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThan(String value) {
            addCriterion("CompanyID >", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyID >=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThan(String value) {
            addCriterion("CompanyID <", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThanOrEqualTo(String value) {
            addCriterion("CompanyID <=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLike(String value) {
            addCriterion("CompanyID like", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotLike(String value) {
            addCriterion("CompanyID not like", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIn(List<String> values) {
            addCriterion("CompanyID in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotIn(List<String> values) {
            addCriterion("CompanyID not in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDBetween(String value1, String value2) {
            addCriterion("CompanyID between", value1, value2, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotBetween(String value1, String value2) {
            addCriterion("CompanyID not between", value1, value2, "companyID");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentIsNull() {
            addCriterion("phaseACurrent is null");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentIsNotNull() {
            addCriterion("phaseACurrent is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentEqualTo(Double value) {
            addCriterion("phaseACurrent =", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentNotEqualTo(Double value) {
            addCriterion("phaseACurrent <>", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentGreaterThan(Double value) {
            addCriterion("phaseACurrent >", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentGreaterThanOrEqualTo(Double value) {
            addCriterion("phaseACurrent >=", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentLessThan(Double value) {
            addCriterion("phaseACurrent <", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentLessThanOrEqualTo(Double value) {
            addCriterion("phaseACurrent <=", value, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentIn(List<Double> values) {
            addCriterion("phaseACurrent in", values, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentNotIn(List<Double> values) {
            addCriterion("phaseACurrent not in", values, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentBetween(Double value1, Double value2) {
            addCriterion("phaseACurrent between", value1, value2, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseACurrentNotBetween(Double value1, Double value2) {
            addCriterion("phaseACurrent not between", value1, value2, "phaseACurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentIsNull() {
            addCriterion("phaseBCurrent is null");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentIsNotNull() {
            addCriterion("phaseBCurrent is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentEqualTo(Double value) {
            addCriterion("phaseBCurrent =", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentNotEqualTo(Double value) {
            addCriterion("phaseBCurrent <>", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentGreaterThan(Double value) {
            addCriterion("phaseBCurrent >", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentGreaterThanOrEqualTo(Double value) {
            addCriterion("phaseBCurrent >=", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentLessThan(Double value) {
            addCriterion("phaseBCurrent <", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentLessThanOrEqualTo(Double value) {
            addCriterion("phaseBCurrent <=", value, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentIn(List<Double> values) {
            addCriterion("phaseBCurrent in", values, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentNotIn(List<Double> values) {
            addCriterion("phaseBCurrent not in", values, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentBetween(Double value1, Double value2) {
            addCriterion("phaseBCurrent between", value1, value2, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseBCurrentNotBetween(Double value1, Double value2) {
            addCriterion("phaseBCurrent not between", value1, value2, "phaseBCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentIsNull() {
            addCriterion("phaseCCurrent is null");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentIsNotNull() {
            addCriterion("phaseCCurrent is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentEqualTo(Double value) {
            addCriterion("phaseCCurrent =", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentNotEqualTo(Double value) {
            addCriterion("phaseCCurrent <>", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentGreaterThan(Double value) {
            addCriterion("phaseCCurrent >", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentGreaterThanOrEqualTo(Double value) {
            addCriterion("phaseCCurrent >=", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentLessThan(Double value) {
            addCriterion("phaseCCurrent <", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentLessThanOrEqualTo(Double value) {
            addCriterion("phaseCCurrent <=", value, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentIn(List<Double> values) {
            addCriterion("phaseCCurrent in", values, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentNotIn(List<Double> values) {
            addCriterion("phaseCCurrent not in", values, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentBetween(Double value1, Double value2) {
            addCriterion("phaseCCurrent between", value1, value2, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andPhaseCCurrentNotBetween(Double value1, Double value2) {
            addCriterion("phaseCCurrent not between", value1, value2, "phaseCCurrent");
            return (Criteria) this;
        }

        public Criteria andCTRatioIsNull() {
            addCriterion("CTRatio is null");
            return (Criteria) this;
        }

        public Criteria andCTRatioIsNotNull() {
            addCriterion("CTRatio is not null");
            return (Criteria) this;
        }

        public Criteria andCTRatioEqualTo(Integer value) {
            addCriterion("CTRatio =", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioNotEqualTo(Integer value) {
            addCriterion("CTRatio <>", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioGreaterThan(Integer value) {
            addCriterion("CTRatio >", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("CTRatio >=", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioLessThan(Integer value) {
            addCriterion("CTRatio <", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioLessThanOrEqualTo(Integer value) {
            addCriterion("CTRatio <=", value, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioIn(List<Integer> values) {
            addCriterion("CTRatio in", values, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioNotIn(List<Integer> values) {
            addCriterion("CTRatio not in", values, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioBetween(Integer value1, Integer value2) {
            addCriterion("CTRatio between", value1, value2, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andCTRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("CTRatio not between", value1, value2, "CTRatio");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeIsNull() {
            addCriterion("LastDataTime is null");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeIsNotNull() {
            addCriterion("LastDataTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeEqualTo(Date value) {
            addCriterion("LastDataTime =", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeNotEqualTo(Date value) {
            addCriterion("LastDataTime <>", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeGreaterThan(Date value) {
            addCriterion("LastDataTime >", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastDataTime >=", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeLessThan(Date value) {
            addCriterion("LastDataTime <", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastDataTime <=", value, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeIn(List<Date> values) {
            addCriterion("LastDataTime in", values, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeNotIn(List<Date> values) {
            addCriterion("LastDataTime not in", values, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeBetween(Date value1, Date value2) {
            addCriterion("LastDataTime between", value1, value2, "lastDataTime");
            return (Criteria) this;
        }

        public Criteria andLastDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastDataTime not between", value1, value2, "lastDataTime");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table Devices
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: Devices
    @mbggenerated 2018-03-27 16:27:29
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}