package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.List;

public class ShensuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ShensuExample() {
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

        public Criteria andShensuIdIsNull() {
            addCriterion("shensu_id is null");
            return (Criteria) this;
        }

        public Criteria andShensuIdIsNotNull() {
            addCriterion("shensu_id is not null");
            return (Criteria) this;
        }

        public Criteria andShensuIdEqualTo(Integer value) {
            addCriterion("shensu_id =", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdNotEqualTo(Integer value) {
            addCriterion("shensu_id <>", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdGreaterThan(Integer value) {
            addCriterion("shensu_id >", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shensu_id >=", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdLessThan(Integer value) {
            addCriterion("shensu_id <", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdLessThanOrEqualTo(Integer value) {
            addCriterion("shensu_id <=", value, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdIn(List<Integer> values) {
            addCriterion("shensu_id in", values, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdNotIn(List<Integer> values) {
            addCriterion("shensu_id not in", values, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdBetween(Integer value1, Integer value2) {
            addCriterion("shensu_id between", value1, value2, "shensuId");
            return (Criteria) this;
        }

        public Criteria andShensuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shensu_id not between", value1, value2, "shensuId");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNull() {
            addCriterion("sa_id is null");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNotNull() {
            addCriterion("sa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaIdEqualTo(Long value) {
            addCriterion("sa_id =", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotEqualTo(Long value) {
            addCriterion("sa_id <>", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThan(Long value) {
            addCriterion("sa_id >", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sa_id >=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThan(Long value) {
            addCriterion("sa_id <", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThanOrEqualTo(Long value) {
            addCriterion("sa_id <=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdIn(List<Long> values) {
            addCriterion("sa_id in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotIn(List<Long> values) {
            addCriterion("sa_id not in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdBetween(Long value1, Long value2) {
            addCriterion("sa_id between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotBetween(Long value1, Long value2) {
            addCriterion("sa_id not between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(Integer value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(Integer value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(Integer value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(Integer value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<Integer> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<Integer> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(Integer value1, Integer value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_id not between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andShensuNextIsNull() {
            addCriterion("shensu_next is null");
            return (Criteria) this;
        }

        public Criteria andShensuNextIsNotNull() {
            addCriterion("shensu_next is not null");
            return (Criteria) this;
        }

        public Criteria andShensuNextEqualTo(String value) {
            addCriterion("shensu_next =", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextNotEqualTo(String value) {
            addCriterion("shensu_next <>", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextGreaterThan(String value) {
            addCriterion("shensu_next >", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextGreaterThanOrEqualTo(String value) {
            addCriterion("shensu_next >=", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextLessThan(String value) {
            addCriterion("shensu_next <", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextLessThanOrEqualTo(String value) {
            addCriterion("shensu_next <=", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextLike(String value) {
            addCriterion("shensu_next like", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextNotLike(String value) {
            addCriterion("shensu_next not like", value, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextIn(List<String> values) {
            addCriterion("shensu_next in", values, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextNotIn(List<String> values) {
            addCriterion("shensu_next not in", values, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextBetween(String value1, String value2) {
            addCriterion("shensu_next between", value1, value2, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andShensuNextNotBetween(String value1, String value2) {
            addCriterion("shensu_next not between", value1, value2, "shensuNext");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("zhuangtai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("zhuangtai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("zhuangtai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("zhuangtai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("zhuangtai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("zhuangtai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai not between", value1, value2, "zhuangtai");
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