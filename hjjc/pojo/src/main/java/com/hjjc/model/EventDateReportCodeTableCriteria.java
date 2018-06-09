package com.hjjc.model;

import java.util.ArrayList;
import java.util.List;

public class EventDateReportCodeTableCriteria {
    /**
     * Table: EventDateReportCodeTable
    @mbggenerated 2018-03-27 16:27:30
     */
    protected String orderByClause;

    /**
     * Table: EventDateReportCodeTable
    @mbggenerated 2018-03-27 16:27:30
     */
    protected boolean distinct;

    /**
     * Table: EventDateReportCodeTable
    @mbggenerated 2018-03-27 16:27:30
     */
    protected List<Criteria> oredCriteria;

    public EventDateReportCodeTableCriteria() {
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
     * Table: EventDateReportCodeTable
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

        public Criteria andEventMemoIsNull() {
            addCriterion("EventMemo is null");
            return (Criteria) this;
        }

        public Criteria andEventMemoIsNotNull() {
            addCriterion("EventMemo is not null");
            return (Criteria) this;
        }

        public Criteria andEventMemoEqualTo(String value) {
            addCriterion("EventMemo =", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoNotEqualTo(String value) {
            addCriterion("EventMemo <>", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoGreaterThan(String value) {
            addCriterion("EventMemo >", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoGreaterThanOrEqualTo(String value) {
            addCriterion("EventMemo >=", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoLessThan(String value) {
            addCriterion("EventMemo <", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoLessThanOrEqualTo(String value) {
            addCriterion("EventMemo <=", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoLike(String value) {
            addCriterion("EventMemo like", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoNotLike(String value) {
            addCriterion("EventMemo not like", value, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoIn(List<String> values) {
            addCriterion("EventMemo in", values, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoNotIn(List<String> values) {
            addCriterion("EventMemo not in", values, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoBetween(String value1, String value2) {
            addCriterion("EventMemo between", value1, value2, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andEventMemoNotBetween(String value1, String value2) {
            addCriterion("EventMemo not between", value1, value2, "eventMemo");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table EventDateReportCodeTable
    @mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * [STRATO MyBatis Generator]
     * Table: EventDateReportCodeTable
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