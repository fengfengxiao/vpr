package com.hjjc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryDataCriteria {
    /**
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
     */
    protected String orderByClause;

    /**
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
     */
    protected boolean distinct;

    /**
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
     */
    protected List<Criteria> oredCriteria;

    public HistoryDataCriteria() {
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
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
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

        public Criteria andDataTime_HourIsNull() {
            addCriterion("DataTime_Hour is null");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourIsNotNull() {
            addCriterion("DataTime_Hour is not null");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourEqualTo(Date value) {
            addCriterion("DataTime_Hour =", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourNotEqualTo(Date value) {
            addCriterion("DataTime_Hour <>", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourGreaterThan(Date value) {
            addCriterion("DataTime_Hour >", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourGreaterThanOrEqualTo(Date value) {
            addCriterion("DataTime_Hour >=", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourLessThan(Date value) {
            addCriterion("DataTime_Hour <", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourLessThanOrEqualTo(Date value) {
            addCriterion("DataTime_Hour <=", value, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourIn(List<Date> values) {
            addCriterion("DataTime_Hour in", values, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourNotIn(List<Date> values) {
            addCriterion("DataTime_Hour not in", values, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourBetween(Date value1, Date value2) {
            addCriterion("DataTime_Hour between", value1, value2, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andDataTime_HourNotBetween(Date value1, Date value2) {
            addCriterion("DataTime_Hour not between", value1, value2, "dataTime_Hour");
            return (Criteria) this;
        }

        public Criteria andCurrentAIsNull() {
            addCriterion("CurrentA is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAIsNotNull() {
            addCriterion("CurrentA is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAEqualTo(Float value) {
            addCriterion("CurrentA =", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentANotEqualTo(Float value) {
            addCriterion("CurrentA <>", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentAGreaterThan(Float value) {
            addCriterion("CurrentA >", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentAGreaterThanOrEqualTo(Float value) {
            addCriterion("CurrentA >=", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentALessThan(Float value) {
            addCriterion("CurrentA <", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentALessThanOrEqualTo(Float value) {
            addCriterion("CurrentA <=", value, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentAIn(List<Float> values) {
            addCriterion("CurrentA in", values, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentANotIn(List<Float> values) {
            addCriterion("CurrentA not in", values, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentABetween(Float value1, Float value2) {
            addCriterion("CurrentA between", value1, value2, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentANotBetween(Float value1, Float value2) {
            addCriterion("CurrentA not between", value1, value2, "currentA");
            return (Criteria) this;
        }

        public Criteria andCurrentBIsNull() {
            addCriterion("CurrentB is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBIsNotNull() {
            addCriterion("CurrentB is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBEqualTo(Float value) {
            addCriterion("CurrentB =", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBNotEqualTo(Float value) {
            addCriterion("CurrentB <>", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBGreaterThan(Float value) {
            addCriterion("CurrentB >", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBGreaterThanOrEqualTo(Float value) {
            addCriterion("CurrentB >=", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBLessThan(Float value) {
            addCriterion("CurrentB <", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBLessThanOrEqualTo(Float value) {
            addCriterion("CurrentB <=", value, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBIn(List<Float> values) {
            addCriterion("CurrentB in", values, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBNotIn(List<Float> values) {
            addCriterion("CurrentB not in", values, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBBetween(Float value1, Float value2) {
            addCriterion("CurrentB between", value1, value2, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentBNotBetween(Float value1, Float value2) {
            addCriterion("CurrentB not between", value1, value2, "currentB");
            return (Criteria) this;
        }

        public Criteria andCurrentCIsNull() {
            addCriterion("CurrentC is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCIsNotNull() {
            addCriterion("CurrentC is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCEqualTo(Float value) {
            addCriterion("CurrentC =", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCNotEqualTo(Float value) {
            addCriterion("CurrentC <>", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCGreaterThan(Float value) {
            addCriterion("CurrentC >", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCGreaterThanOrEqualTo(Float value) {
            addCriterion("CurrentC >=", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCLessThan(Float value) {
            addCriterion("CurrentC <", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCLessThanOrEqualTo(Float value) {
            addCriterion("CurrentC <=", value, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCIn(List<Float> values) {
            addCriterion("CurrentC in", values, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCNotIn(List<Float> values) {
            addCriterion("CurrentC not in", values, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCBetween(Float value1, Float value2) {
            addCriterion("CurrentC between", value1, value2, "currentC");
            return (Criteria) this;
        }

        public Criteria andCurrentCNotBetween(Float value1, Float value2) {
            addCriterion("CurrentC not between", value1, value2, "currentC");
            return (Criteria) this;
        }

        public Criteria andVoltAIsNull() {
            addCriterion("VoltA is null");
            return (Criteria) this;
        }

        public Criteria andVoltAIsNotNull() {
            addCriterion("VoltA is not null");
            return (Criteria) this;
        }

        public Criteria andVoltAEqualTo(Float value) {
            addCriterion("VoltA =", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotEqualTo(Float value) {
            addCriterion("VoltA <>", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAGreaterThan(Float value) {
            addCriterion("VoltA >", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAGreaterThanOrEqualTo(Float value) {
            addCriterion("VoltA >=", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltALessThan(Float value) {
            addCriterion("VoltA <", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltALessThanOrEqualTo(Float value) {
            addCriterion("VoltA <=", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAIn(List<Float> values) {
            addCriterion("VoltA in", values, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotIn(List<Float> values) {
            addCriterion("VoltA not in", values, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltABetween(Float value1, Float value2) {
            addCriterion("VoltA between", value1, value2, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotBetween(Float value1, Float value2) {
            addCriterion("VoltA not between", value1, value2, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltBIsNull() {
            addCriterion("VoltB is null");
            return (Criteria) this;
        }

        public Criteria andVoltBIsNotNull() {
            addCriterion("VoltB is not null");
            return (Criteria) this;
        }

        public Criteria andVoltBEqualTo(Float value) {
            addCriterion("VoltB =", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotEqualTo(Float value) {
            addCriterion("VoltB <>", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBGreaterThan(Float value) {
            addCriterion("VoltB >", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBGreaterThanOrEqualTo(Float value) {
            addCriterion("VoltB >=", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBLessThan(Float value) {
            addCriterion("VoltB <", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBLessThanOrEqualTo(Float value) {
            addCriterion("VoltB <=", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBIn(List<Float> values) {
            addCriterion("VoltB in", values, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotIn(List<Float> values) {
            addCriterion("VoltB not in", values, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBBetween(Float value1, Float value2) {
            addCriterion("VoltB between", value1, value2, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotBetween(Float value1, Float value2) {
            addCriterion("VoltB not between", value1, value2, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltCIsNull() {
            addCriterion("VoltC is null");
            return (Criteria) this;
        }

        public Criteria andVoltCIsNotNull() {
            addCriterion("VoltC is not null");
            return (Criteria) this;
        }

        public Criteria andVoltCEqualTo(Float value) {
            addCriterion("VoltC =", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotEqualTo(Float value) {
            addCriterion("VoltC <>", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCGreaterThan(Float value) {
            addCriterion("VoltC >", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCGreaterThanOrEqualTo(Float value) {
            addCriterion("VoltC >=", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCLessThan(Float value) {
            addCriterion("VoltC <", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCLessThanOrEqualTo(Float value) {
            addCriterion("VoltC <=", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCIn(List<Float> values) {
            addCriterion("VoltC in", values, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotIn(List<Float> values) {
            addCriterion("VoltC not in", values, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCBetween(Float value1, Float value2) {
            addCriterion("VoltC between", value1, value2, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotBetween(Float value1, Float value2) {
            addCriterion("VoltC not between", value1, value2, "voltC");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("isAvailable is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("isAvailable is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(Boolean value) {
            addCriterion("isAvailable =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(Boolean value) {
            addCriterion("isAvailable <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(Boolean value) {
            addCriterion("isAvailable >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAvailable >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(Boolean value) {
            addCriterion("isAvailable <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(Boolean value) {
            addCriterion("isAvailable <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<Boolean> values) {
            addCriterion("isAvailable in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<Boolean> values) {
            addCriterion("isAvailable not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(Boolean value1, Boolean value2) {
            addCriterion("isAvailable between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAvailable not between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIsNull() {
            addCriterion("isCalculate is null");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIsNotNull() {
            addCriterion("isCalculate is not null");
            return (Criteria) this;
        }

        public Criteria andIsCalculateEqualTo(Boolean value) {
            addCriterion("isCalculate =", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotEqualTo(Boolean value) {
            addCriterion("isCalculate <>", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateGreaterThan(Boolean value) {
            addCriterion("isCalculate >", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCalculate >=", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateLessThan(Boolean value) {
            addCriterion("isCalculate <", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateLessThanOrEqualTo(Boolean value) {
            addCriterion("isCalculate <=", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIn(List<Boolean> values) {
            addCriterion("isCalculate in", values, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotIn(List<Boolean> values) {
            addCriterion("isCalculate not in", values, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateBetween(Boolean value1, Boolean value2) {
            addCriterion("isCalculate between", value1, value2, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCalculate not between", value1, value2, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andEnergyAIsNull() {
            addCriterion("EnergyA is null");
            return (Criteria) this;
        }

        public Criteria andEnergyAIsNotNull() {
            addCriterion("EnergyA is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyAEqualTo(Float value) {
            addCriterion("EnergyA =", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyANotEqualTo(Float value) {
            addCriterion("EnergyA <>", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyAGreaterThan(Float value) {
            addCriterion("EnergyA >", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyAGreaterThanOrEqualTo(Float value) {
            addCriterion("EnergyA >=", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyALessThan(Float value) {
            addCriterion("EnergyA <", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyALessThanOrEqualTo(Float value) {
            addCriterion("EnergyA <=", value, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyAIn(List<Float> values) {
            addCriterion("EnergyA in", values, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyANotIn(List<Float> values) {
            addCriterion("EnergyA not in", values, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyABetween(Float value1, Float value2) {
            addCriterion("EnergyA between", value1, value2, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyANotBetween(Float value1, Float value2) {
            addCriterion("EnergyA not between", value1, value2, "energyA");
            return (Criteria) this;
        }

        public Criteria andEnergyBIsNull() {
            addCriterion("EnergyB is null");
            return (Criteria) this;
        }

        public Criteria andEnergyBIsNotNull() {
            addCriterion("EnergyB is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyBEqualTo(Float value) {
            addCriterion("EnergyB =", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBNotEqualTo(Float value) {
            addCriterion("EnergyB <>", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBGreaterThan(Float value) {
            addCriterion("EnergyB >", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBGreaterThanOrEqualTo(Float value) {
            addCriterion("EnergyB >=", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBLessThan(Float value) {
            addCriterion("EnergyB <", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBLessThanOrEqualTo(Float value) {
            addCriterion("EnergyB <=", value, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBIn(List<Float> values) {
            addCriterion("EnergyB in", values, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBNotIn(List<Float> values) {
            addCriterion("EnergyB not in", values, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBBetween(Float value1, Float value2) {
            addCriterion("EnergyB between", value1, value2, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyBNotBetween(Float value1, Float value2) {
            addCriterion("EnergyB not between", value1, value2, "energyB");
            return (Criteria) this;
        }

        public Criteria andEnergyCIsNull() {
            addCriterion("EnergyC is null");
            return (Criteria) this;
        }

        public Criteria andEnergyCIsNotNull() {
            addCriterion("EnergyC is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyCEqualTo(Float value) {
            addCriterion("EnergyC =", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCNotEqualTo(Float value) {
            addCriterion("EnergyC <>", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCGreaterThan(Float value) {
            addCriterion("EnergyC >", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCGreaterThanOrEqualTo(Float value) {
            addCriterion("EnergyC >=", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCLessThan(Float value) {
            addCriterion("EnergyC <", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCLessThanOrEqualTo(Float value) {
            addCriterion("EnergyC <=", value, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCIn(List<Float> values) {
            addCriterion("EnergyC in", values, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCNotIn(List<Float> values) {
            addCriterion("EnergyC not in", values, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCBetween(Float value1, Float value2) {
            addCriterion("EnergyC between", value1, value2, "energyC");
            return (Criteria) this;
        }

        public Criteria andEnergyCNotBetween(Float value1, Float value2) {
            addCriterion("EnergyC not between", value1, value2, "energyC");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table HistoryData
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
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