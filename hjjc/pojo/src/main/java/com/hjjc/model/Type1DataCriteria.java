package com.hjjc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Type1DataCriteria {
    /**
     * Table: Type1Data
    @mbggenerated 2018-03-27 16:27:30
     */
    protected String orderByClause;

    /**
     * Table: Type1Data
    @mbggenerated 2018-03-27 16:27:30
     */
    protected boolean distinct;

    /**
     * Table: Type1Data
    @mbggenerated 2018-03-27 16:27:30
     */
    protected List<Criteria> oredCriteria;

    public Type1DataCriteria() {
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
     * Table: Type1Data
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

        public Criteria andDataTimeIsNull() {
            addCriterion("DataTime is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("DataTime is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("DataTime =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("DataTime <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("DataTime >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DataTime >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("DataTime <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("DataTime <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("DataTime in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("DataTime not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("DataTime between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("DataTime not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andCurrent_AIsNull() {
            addCriterion("Current_A is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_AIsNotNull() {
            addCriterion("Current_A is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_AEqualTo(Double value) {
            addCriterion("Current_A =", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ANotEqualTo(Double value) {
            addCriterion("Current_A <>", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_AGreaterThan(Double value) {
            addCriterion("Current_A >", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_AGreaterThanOrEqualTo(Double value) {
            addCriterion("Current_A >=", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ALessThan(Double value) {
            addCriterion("Current_A <", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ALessThanOrEqualTo(Double value) {
            addCriterion("Current_A <=", value, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_AIn(List<Double> values) {
            addCriterion("Current_A in", values, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ANotIn(List<Double> values) {
            addCriterion("Current_A not in", values, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ABetween(Double value1, Double value2) {
            addCriterion("Current_A between", value1, value2, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_ANotBetween(Double value1, Double value2) {
            addCriterion("Current_A not between", value1, value2, "current_A");
            return (Criteria) this;
        }

        public Criteria andCurrent_BIsNull() {
            addCriterion("Current_B is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_BIsNotNull() {
            addCriterion("Current_B is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_BEqualTo(Double value) {
            addCriterion("Current_B =", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BNotEqualTo(Double value) {
            addCriterion("Current_B <>", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BGreaterThan(Double value) {
            addCriterion("Current_B >", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BGreaterThanOrEqualTo(Double value) {
            addCriterion("Current_B >=", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BLessThan(Double value) {
            addCriterion("Current_B <", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BLessThanOrEqualTo(Double value) {
            addCriterion("Current_B <=", value, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BIn(List<Double> values) {
            addCriterion("Current_B in", values, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BNotIn(List<Double> values) {
            addCriterion("Current_B not in", values, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BBetween(Double value1, Double value2) {
            addCriterion("Current_B between", value1, value2, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_BNotBetween(Double value1, Double value2) {
            addCriterion("Current_B not between", value1, value2, "current_B");
            return (Criteria) this;
        }

        public Criteria andCurrent_CIsNull() {
            addCriterion("Current_C is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_CIsNotNull() {
            addCriterion("Current_C is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_CEqualTo(Double value) {
            addCriterion("Current_C =", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CNotEqualTo(Double value) {
            addCriterion("Current_C <>", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CGreaterThan(Double value) {
            addCriterion("Current_C >", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CGreaterThanOrEqualTo(Double value) {
            addCriterion("Current_C >=", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CLessThan(Double value) {
            addCriterion("Current_C <", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CLessThanOrEqualTo(Double value) {
            addCriterion("Current_C <=", value, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CIn(List<Double> values) {
            addCriterion("Current_C in", values, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CNotIn(List<Double> values) {
            addCriterion("Current_C not in", values, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CBetween(Double value1, Double value2) {
            addCriterion("Current_C between", value1, value2, "current_C");
            return (Criteria) this;
        }

        public Criteria andCurrent_CNotBetween(Double value1, Double value2) {
            addCriterion("Current_C not between", value1, value2, "current_C");
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

        public Criteria andVoltAEqualTo(Double value) {
            addCriterion("VoltA =", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotEqualTo(Double value) {
            addCriterion("VoltA <>", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAGreaterThan(Double value) {
            addCriterion("VoltA >", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAGreaterThanOrEqualTo(Double value) {
            addCriterion("VoltA >=", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltALessThan(Double value) {
            addCriterion("VoltA <", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltALessThanOrEqualTo(Double value) {
            addCriterion("VoltA <=", value, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltAIn(List<Double> values) {
            addCriterion("VoltA in", values, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotIn(List<Double> values) {
            addCriterion("VoltA not in", values, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltABetween(Double value1, Double value2) {
            addCriterion("VoltA between", value1, value2, "voltA");
            return (Criteria) this;
        }

        public Criteria andVoltANotBetween(Double value1, Double value2) {
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

        public Criteria andVoltBEqualTo(Double value) {
            addCriterion("VoltB =", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotEqualTo(Double value) {
            addCriterion("VoltB <>", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBGreaterThan(Double value) {
            addCriterion("VoltB >", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBGreaterThanOrEqualTo(Double value) {
            addCriterion("VoltB >=", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBLessThan(Double value) {
            addCriterion("VoltB <", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBLessThanOrEqualTo(Double value) {
            addCriterion("VoltB <=", value, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBIn(List<Double> values) {
            addCriterion("VoltB in", values, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotIn(List<Double> values) {
            addCriterion("VoltB not in", values, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBBetween(Double value1, Double value2) {
            addCriterion("VoltB between", value1, value2, "voltB");
            return (Criteria) this;
        }

        public Criteria andVoltBNotBetween(Double value1, Double value2) {
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

        public Criteria andVoltCEqualTo(Double value) {
            addCriterion("VoltC =", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotEqualTo(Double value) {
            addCriterion("VoltC <>", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCGreaterThan(Double value) {
            addCriterion("VoltC >", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCGreaterThanOrEqualTo(Double value) {
            addCriterion("VoltC >=", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCLessThan(Double value) {
            addCriterion("VoltC <", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCLessThanOrEqualTo(Double value) {
            addCriterion("VoltC <=", value, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCIn(List<Double> values) {
            addCriterion("VoltC in", values, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotIn(List<Double> values) {
            addCriterion("VoltC not in", values, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCBetween(Double value1, Double value2) {
            addCriterion("VoltC between", value1, value2, "voltC");
            return (Criteria) this;
        }

        public Criteria andVoltCNotBetween(Double value1, Double value2) {
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
    }

    /**
     * This class corresponds to the database table Type1Data
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: Type1Data
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