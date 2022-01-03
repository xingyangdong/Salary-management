package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.List;

public class BmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BmExample() {
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

        public Criteria andBmIdIsNull() {
            addCriterion("bm_id is null");
            return (Criteria) this;
        }

        public Criteria andBmIdIsNotNull() {
            addCriterion("bm_id is not null");
            return (Criteria) this;
        }

        public Criteria andBmIdEqualTo(Integer value) {
            addCriterion("bm_id =", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotEqualTo(Integer value) {
            addCriterion("bm_id <>", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdGreaterThan(Integer value) {
            addCriterion("bm_id >", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bm_id >=", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdLessThan(Integer value) {
            addCriterion("bm_id <", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdLessThanOrEqualTo(Integer value) {
            addCriterion("bm_id <=", value, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdIn(List<Integer> values) {
            addCriterion("bm_id in", values, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotIn(List<Integer> values) {
            addCriterion("bm_id not in", values, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdBetween(Integer value1, Integer value2) {
            addCriterion("bm_id between", value1, value2, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bm_id not between", value1, value2, "bmId");
            return (Criteria) this;
        }

        public Criteria andBmTimeIsNull() {
            addCriterion("bm_time is null");
            return (Criteria) this;
        }

        public Criteria andBmTimeIsNotNull() {
            addCriterion("bm_time is not null");
            return (Criteria) this;
        }

        public Criteria andBmTimeEqualTo(String value) {
            addCriterion("bm_time =", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeNotEqualTo(String value) {
            addCriterion("bm_time <>", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeGreaterThan(String value) {
            addCriterion("bm_time >", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_time >=", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeLessThan(String value) {
            addCriterion("bm_time <", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeLessThanOrEqualTo(String value) {
            addCriterion("bm_time <=", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeLike(String value) {
            addCriterion("bm_time like", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeNotLike(String value) {
            addCriterion("bm_time not like", value, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeIn(List<String> values) {
            addCriterion("bm_time in", values, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeNotIn(List<String> values) {
            addCriterion("bm_time not in", values, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeBetween(String value1, String value2) {
            addCriterion("bm_time between", value1, value2, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmTimeNotBetween(String value1, String value2) {
            addCriterion("bm_time not between", value1, value2, "bmTime");
            return (Criteria) this;
        }

        public Criteria andBmFuzeIsNull() {
            addCriterion("bm_fuze is null");
            return (Criteria) this;
        }

        public Criteria andBmFuzeIsNotNull() {
            addCriterion("bm_fuze is not null");
            return (Criteria) this;
        }

        public Criteria andBmFuzeEqualTo(String value) {
            addCriterion("bm_fuze =", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeNotEqualTo(String value) {
            addCriterion("bm_fuze <>", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeGreaterThan(String value) {
            addCriterion("bm_fuze >", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeGreaterThanOrEqualTo(String value) {
            addCriterion("bm_fuze >=", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeLessThan(String value) {
            addCriterion("bm_fuze <", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeLessThanOrEqualTo(String value) {
            addCriterion("bm_fuze <=", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeLike(String value) {
            addCriterion("bm_fuze like", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeNotLike(String value) {
            addCriterion("bm_fuze not like", value, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeIn(List<String> values) {
            addCriterion("bm_fuze in", values, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeNotIn(List<String> values) {
            addCriterion("bm_fuze not in", values, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeBetween(String value1, String value2) {
            addCriterion("bm_fuze between", value1, value2, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmFuzeNotBetween(String value1, String value2) {
            addCriterion("bm_fuze not between", value1, value2, "bmFuze");
            return (Criteria) this;
        }

        public Criteria andBmNameIsNull() {
            addCriterion("bm_name is null");
            return (Criteria) this;
        }

        public Criteria andBmNameIsNotNull() {
            addCriterion("bm_name is not null");
            return (Criteria) this;
        }

        public Criteria andBmNameEqualTo(String value) {
            addCriterion("bm_name =", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameNotEqualTo(String value) {
            addCriterion("bm_name <>", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameGreaterThan(String value) {
            addCriterion("bm_name >", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameGreaterThanOrEqualTo(String value) {
            addCriterion("bm_name >=", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameLessThan(String value) {
            addCriterion("bm_name <", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameLessThanOrEqualTo(String value) {
            addCriterion("bm_name <=", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameLike(String value) {
            addCriterion("bm_name like", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameNotLike(String value) {
            addCriterion("bm_name not like", value, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameIn(List<String> values) {
            addCriterion("bm_name in", values, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameNotIn(List<String> values) {
            addCriterion("bm_name not in", values, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameBetween(String value1, String value2) {
            addCriterion("bm_name between", value1, value2, "bmName");
            return (Criteria) this;
        }

        public Criteria andBmNameNotBetween(String value1, String value2) {
            addCriterion("bm_name not between", value1, value2, "bmName");
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