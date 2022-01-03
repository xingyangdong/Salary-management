package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.List;

public class ZhiweiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ZhiweiExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        public Criteria andZhiweiIdIsNull() {
            addCriterion("zhiwei_id is null");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdIsNotNull() {
            addCriterion("zhiwei_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdEqualTo(Integer value) {
            addCriterion("zhiwei_id =", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdNotEqualTo(Integer value) {
            addCriterion("zhiwei_id <>", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdGreaterThan(Integer value) {
            addCriterion("zhiwei_id >", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhiwei_id >=", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdLessThan(Integer value) {
            addCriterion("zhiwei_id <", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdLessThanOrEqualTo(Integer value) {
            addCriterion("zhiwei_id <=", value, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdIn(List<Integer> values) {
            addCriterion("zhiwei_id in", values, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdNotIn(List<Integer> values) {
            addCriterion("zhiwei_id not in", values, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdBetween(Integer value1, Integer value2) {
            addCriterion("zhiwei_id between", value1, value2, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zhiwei_id not between", value1, value2, "zhiweiId");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameIsNull() {
            addCriterion("zhiwei_name is null");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameIsNotNull() {
            addCriterion("zhiwei_name is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameEqualTo(String value) {
            addCriterion("zhiwei_name =", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameNotEqualTo(String value) {
            addCriterion("zhiwei_name <>", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameGreaterThan(String value) {
            addCriterion("zhiwei_name >", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameGreaterThanOrEqualTo(String value) {
            addCriterion("zhiwei_name >=", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameLessThan(String value) {
            addCriterion("zhiwei_name <", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameLessThanOrEqualTo(String value) {
            addCriterion("zhiwei_name <=", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameLike(String value) {
            addCriterion("zhiwei_name like", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameNotLike(String value) {
            addCriterion("zhiwei_name not like", value, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameIn(List<String> values) {
            addCriterion("zhiwei_name in", values, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameNotIn(List<String> values) {
            addCriterion("zhiwei_name not in", values, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameBetween(String value1, String value2) {
            addCriterion("zhiwei_name between", value1, value2, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andZhiweiNameNotBetween(String value1, String value2) {
            addCriterion("zhiwei_name not between", value1, value2, "zhiweiName");
            return (Criteria) this;
        }

        public Criteria andBumenNameIsNull() {
            addCriterion("bumen_name is null");
            return (Criteria) this;
        }

        public Criteria andBumenNameIsNotNull() {
            addCriterion("bumen_name is not null");
            return (Criteria) this;
        }

        public Criteria andBumenNameEqualTo(String value) {
            addCriterion("bumen_name =", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameNotEqualTo(String value) {
            addCriterion("bumen_name <>", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameGreaterThan(String value) {
            addCriterion("bumen_name >", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameGreaterThanOrEqualTo(String value) {
            addCriterion("bumen_name >=", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameLessThan(String value) {
            addCriterion("bumen_name <", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameLessThanOrEqualTo(String value) {
            addCriterion("bumen_name <=", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameLike(String value) {
            addCriterion("bumen_name like", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameNotLike(String value) {
            addCriterion("bumen_name not like", value, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameIn(List<String> values) {
            addCriterion("bumen_name in", values, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameNotIn(List<String> values) {
            addCriterion("bumen_name not in", values, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameBetween(String value1, String value2) {
            addCriterion("bumen_name between", value1, value2, "bumenName");
            return (Criteria) this;
        }

        public Criteria andBumenNameNotBetween(String value1, String value2) {
            addCriterion("bumen_name not between", value1, value2, "bumenName");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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