package com.hjjc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventDateReportCriteria {
    /**
     * Table: EventDateReport
    @mbggenerated 2018-03-27 16:27:29
     */
    protected String orderByClause;

    /**
     * Table: EventDateReport
    @mbggenerated 2018-03-27 16:27:29
     */
    protected boolean distinct;

    /**
     * Table: EventDateReport
    @mbggenerated 2018-03-27 16:27:29
     */
    protected List<Criteria> oredCriteria;

    public EventDateReportCriteria() {
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
     * Table: EventDateReport
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andDateTimeIsNull() {
            addCriterion("DateTime is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("DateTime =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("DateTime <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("DateTime >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("DateTime <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DateTime <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("DateTime in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("DateTime not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("DateTime between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DateTime not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedIsNull() {
            addCriterion("Confirmed is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedIsNotNull() {
            addCriterion("Confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedEqualTo(String value) {
            addCriterion("Confirmed =", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotEqualTo(String value) {
            addCriterion("Confirmed <>", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThan(String value) {
            addCriterion("Confirmed >", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThanOrEqualTo(String value) {
            addCriterion("Confirmed >=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThan(String value) {
            addCriterion("Confirmed <", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThanOrEqualTo(String value) {
            addCriterion("Confirmed <=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLike(String value) {
            addCriterion("Confirmed like", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotLike(String value) {
            addCriterion("Confirmed not like", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedIn(List<String> values) {
            addCriterion("Confirmed in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotIn(List<String> values) {
            addCriterion("Confirmed not in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedBetween(String value1, String value2) {
            addCriterion("Confirmed between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotBetween(String value1, String value2) {
            addCriterion("Confirmed not between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andEventCodeIsNull() {
            addCriterion("EventCode is null");
            return (Criteria) this;
        }

        public Criteria andEventCodeIsNotNull() {
            addCriterion("EventCode is not null");
            return (Criteria) this;
        }

        public Criteria andEventCodeEqualTo(Integer value) {
            addCriterion("EventCode =", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotEqualTo(Integer value) {
            addCriterion("EventCode <>", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeGreaterThan(Integer value) {
            addCriterion("EventCode >", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EventCode >=", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeLessThan(Integer value) {
            addCriterion("EventCode <", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeLessThanOrEqualTo(Integer value) {
            addCriterion("EventCode <=", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeIn(List<Integer> values) {
            addCriterion("EventCode in", values, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotIn(List<Integer> values) {
            addCriterion("EventCode not in", values, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeBetween(Integer value1, Integer value2) {
            addCriterion("EventCode between", value1, value2, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("EventCode not between", value1, value2, "eventCode");
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

        public Criteria andEventTypeIsNull() {
            addCriterion("EventType is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("EventType is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(Integer value) {
            addCriterion("EventType =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(Integer value) {
            addCriterion("EventType <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(Integer value) {
            addCriterion("EventType >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EventType >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(Integer value) {
            addCriterion("EventType <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(Integer value) {
            addCriterion("EventType <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<Integer> values) {
            addCriterion("EventType in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<Integer> values) {
            addCriterion("EventType not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(Integer value1, Integer value2) {
            addCriterion("EventType between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("EventType not between", value1, value2, "eventType");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table EventDateReport
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: EventDateReport
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