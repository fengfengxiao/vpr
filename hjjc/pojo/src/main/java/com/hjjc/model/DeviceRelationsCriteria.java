package com.hjjc.model;

import java.util.ArrayList;
import java.util.List;

public class DeviceRelationsCriteria {
    /**
     * Table: DeviceRelations
    @mbggenerated 2018-03-27 16:27:29
     */
    protected String orderByClause;

    /**
     * Table: DeviceRelations
    @mbggenerated 2018-03-27 16:27:29
     */
    protected boolean distinct;

    /**
     * Table: DeviceRelations
    @mbggenerated 2018-03-27 16:27:29
     */
    protected List<Criteria> oredCriteria;

    public DeviceRelationsCriteria() {
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
     * Table: DeviceRelations
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

        public Criteria andDR_idIsNull() {
            addCriterion("DR_id is null");
            return (Criteria) this;
        }

        public Criteria andDR_idIsNotNull() {
            addCriterion("DR_id is not null");
            return (Criteria) this;
        }

        public Criteria andDR_idEqualTo(Integer value) {
            addCriterion("DR_id =", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idNotEqualTo(Integer value) {
            addCriterion("DR_id <>", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idGreaterThan(Integer value) {
            addCriterion("DR_id >", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("DR_id >=", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idLessThan(Integer value) {
            addCriterion("DR_id <", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idLessThanOrEqualTo(Integer value) {
            addCriterion("DR_id <=", value, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idIn(List<Integer> values) {
            addCriterion("DR_id in", values, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idNotIn(List<Integer> values) {
            addCriterion("DR_id not in", values, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idBetween(Integer value1, Integer value2) {
            addCriterion("DR_id between", value1, value2, "DR_id");
            return (Criteria) this;
        }

        public Criteria andDR_idNotBetween(Integer value1, Integer value2) {
            addCriterion("DR_id not between", value1, value2, "DR_id");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDIsNull() {
            addCriterion("SCDeviceID is null");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDIsNotNull() {
            addCriterion("SCDeviceID is not null");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDEqualTo(String value) {
            addCriterion("SCDeviceID =", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDNotEqualTo(String value) {
            addCriterion("SCDeviceID <>", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDGreaterThan(String value) {
            addCriterion("SCDeviceID >", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDGreaterThanOrEqualTo(String value) {
            addCriterion("SCDeviceID >=", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDLessThan(String value) {
            addCriterion("SCDeviceID <", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDLessThanOrEqualTo(String value) {
            addCriterion("SCDeviceID <=", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDLike(String value) {
            addCriterion("SCDeviceID like", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDNotLike(String value) {
            addCriterion("SCDeviceID not like", value, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDIn(List<String> values) {
            addCriterion("SCDeviceID in", values, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDNotIn(List<String> values) {
            addCriterion("SCDeviceID not in", values, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDBetween(String value1, String value2) {
            addCriterion("SCDeviceID between", value1, value2, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andSCDeviceIDNotBetween(String value1, String value2) {
            addCriterion("SCDeviceID not between", value1, value2, "SCDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDIsNull() {
            addCriterion("HBDeviceID is null");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDIsNotNull() {
            addCriterion("HBDeviceID is not null");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDEqualTo(String value) {
            addCriterion("HBDeviceID =", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDNotEqualTo(String value) {
            addCriterion("HBDeviceID <>", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDGreaterThan(String value) {
            addCriterion("HBDeviceID >", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDGreaterThanOrEqualTo(String value) {
            addCriterion("HBDeviceID >=", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDLessThan(String value) {
            addCriterion("HBDeviceID <", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDLessThanOrEqualTo(String value) {
            addCriterion("HBDeviceID <=", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDLike(String value) {
            addCriterion("HBDeviceID like", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDNotLike(String value) {
            addCriterion("HBDeviceID not like", value, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDIn(List<String> values) {
            addCriterion("HBDeviceID in", values, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDNotIn(List<String> values) {
            addCriterion("HBDeviceID not in", values, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDBetween(String value1, String value2) {
            addCriterion("HBDeviceID between", value1, value2, "HBDeviceID");
            return (Criteria) this;
        }

        public Criteria andHBDeviceIDNotBetween(String value1, String value2) {
            addCriterion("HBDeviceID not between", value1, value2, "HBDeviceID");
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
    }

    /**
     * This class corresponds to the database table DeviceRelations
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:29
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: DeviceRelations
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