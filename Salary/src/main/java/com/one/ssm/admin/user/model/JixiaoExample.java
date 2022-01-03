package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.List;

public class JixiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public JixiaoExample() {
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

        public Criteria andXuhaoIsNull() {
            addCriterion("xuhao is null");
            return (Criteria) this;
        }

        public Criteria andXuhaoIsNotNull() {
            addCriterion("xuhao is not null");
            return (Criteria) this;
        }

        public Criteria andXuhaoEqualTo(Integer value) {
            addCriterion("xuhao =", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotEqualTo(Integer value) {
            addCriterion("xuhao <>", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThan(Integer value) {
            addCriterion("xuhao >", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("xuhao >=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThan(Integer value) {
            addCriterion("xuhao <", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoLessThanOrEqualTo(Integer value) {
            addCriterion("xuhao <=", value, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoIn(List<Integer> values) {
            addCriterion("xuhao in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotIn(List<Integer> values) {
            addCriterion("xuhao not in", values, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoBetween(Integer value1, Integer value2) {
            addCriterion("xuhao between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andXuhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("xuhao not between", value1, value2, "xuhao");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`year` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`year` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("`year` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("`year` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("`year` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("`year` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("`year` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("`year` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("`year` like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("`year` not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("`year` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("`year` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("`year` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("`year` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andJiduIsNull() {
            addCriterion("jidu is null");
            return (Criteria) this;
        }

        public Criteria andJiduIsNotNull() {
            addCriterion("jidu is not null");
            return (Criteria) this;
        }

        public Criteria andJiduEqualTo(String value) {
            addCriterion("jidu =", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotEqualTo(String value) {
            addCriterion("jidu <>", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThan(String value) {
            addCriterion("jidu >", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThanOrEqualTo(String value) {
            addCriterion("jidu >=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThan(String value) {
            addCriterion("jidu <", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThanOrEqualTo(String value) {
            addCriterion("jidu <=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLike(String value) {
            addCriterion("jidu like", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotLike(String value) {
            addCriterion("jidu not like", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduIn(List<String> values) {
            addCriterion("jidu in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotIn(List<String> values) {
            addCriterion("jidu not in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduBetween(String value1, String value2) {
            addCriterion("jidu between", value1, value2, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotBetween(String value1, String value2) {
            addCriterion("jidu not between", value1, value2, "jidu");
            return (Criteria) this;
        }

        public Criteria andPingjiIsNull() {
            addCriterion("pingji is null");
            return (Criteria) this;
        }

        public Criteria andPingjiIsNotNull() {
            addCriterion("pingji is not null");
            return (Criteria) this;
        }

        public Criteria andPingjiEqualTo(String value) {
            addCriterion("pingji =", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiNotEqualTo(String value) {
            addCriterion("pingji <>", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiGreaterThan(String value) {
            addCriterion("pingji >", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiGreaterThanOrEqualTo(String value) {
            addCriterion("pingji >=", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiLessThan(String value) {
            addCriterion("pingji <", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiLessThanOrEqualTo(String value) {
            addCriterion("pingji <=", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiLike(String value) {
            addCriterion("pingji like", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiNotLike(String value) {
            addCriterion("pingji not like", value, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiIn(List<String> values) {
            addCriterion("pingji in", values, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiNotIn(List<String> values) {
            addCriterion("pingji not in", values, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiBetween(String value1, String value2) {
            addCriterion("pingji between", value1, value2, "pingji");
            return (Criteria) this;
        }

        public Criteria andPingjiNotBetween(String value1, String value2) {
            addCriterion("pingji not between", value1, value2, "pingji");
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