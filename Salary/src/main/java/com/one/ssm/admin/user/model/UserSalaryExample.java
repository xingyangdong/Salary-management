package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.List;

public class UserSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserSalaryExample() {
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

        public Criteria andXingzhiIsNull() {
            addCriterion("xingzhi is null");
            return (Criteria) this;
        }

        public Criteria andXingzhiIsNotNull() {
            addCriterion("xingzhi is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhiEqualTo(String value) {
            addCriterion("xingzhi =", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotEqualTo(String value) {
            addCriterion("xingzhi <>", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiGreaterThan(String value) {
            addCriterion("xingzhi >", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("xingzhi >=", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiLessThan(String value) {
            addCriterion("xingzhi <", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiLessThanOrEqualTo(String value) {
            addCriterion("xingzhi <=", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiLike(String value) {
            addCriterion("xingzhi like", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotLike(String value) {
            addCriterion("xingzhi not like", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiIn(List<String> values) {
            addCriterion("xingzhi in", values, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotIn(List<String> values) {
            addCriterion("xingzhi not in", values, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiBetween(String value1, String value2) {
            addCriterion("xingzhi between", value1, value2, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotBetween(String value1, String value2) {
            addCriterion("xingzhi not between", value1, value2, "xingzhi");
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

        public Criteria andBumenIsNull() {
            addCriterion("bumen is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("bumen is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(String value) {
            addCriterion("bumen =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(String value) {
            addCriterion("bumen <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(String value) {
            addCriterion("bumen >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(String value) {
            addCriterion("bumen >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(String value) {
            addCriterion("bumen <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(String value) {
            addCriterion("bumen <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLike(String value) {
            addCriterion("bumen like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotLike(String value) {
            addCriterion("bumen not like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<String> values) {
            addCriterion("bumen in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<String> values) {
            addCriterion("bumen not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(String value1, String value2) {
            addCriterion("bumen between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(String value1, String value2) {
            addCriterion("bumen not between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andSaJibenIsNull() {
            addCriterion("sa_jiben is null");
            return (Criteria) this;
        }

        public Criteria andSaJibenIsNotNull() {
            addCriterion("sa_jiben is not null");
            return (Criteria) this;
        }

        public Criteria andSaJibenEqualTo(String value) {
            addCriterion("sa_jiben =", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenNotEqualTo(String value) {
            addCriterion("sa_jiben <>", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenGreaterThan(String value) {
            addCriterion("sa_jiben >", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenGreaterThanOrEqualTo(String value) {
            addCriterion("sa_jiben >=", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenLessThan(String value) {
            addCriterion("sa_jiben <", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenLessThanOrEqualTo(String value) {
            addCriterion("sa_jiben <=", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenLike(String value) {
            addCriterion("sa_jiben like", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenNotLike(String value) {
            addCriterion("sa_jiben not like", value, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenIn(List<String> values) {
            addCriterion("sa_jiben in", values, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenNotIn(List<String> values) {
            addCriterion("sa_jiben not in", values, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenBetween(String value1, String value2) {
            addCriterion("sa_jiben between", value1, value2, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaJibenNotBetween(String value1, String value2) {
            addCriterion("sa_jiben not between", value1, value2, "saJiben");
            return (Criteria) this;
        }

        public Criteria andSaShiyeIsNull() {
            addCriterion("sa_shiye is null");
            return (Criteria) this;
        }

        public Criteria andSaShiyeIsNotNull() {
            addCriterion("sa_shiye is not null");
            return (Criteria) this;
        }

        public Criteria andSaShiyeEqualTo(String value) {
            addCriterion("sa_shiye =", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeNotEqualTo(String value) {
            addCriterion("sa_shiye <>", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeGreaterThan(String value) {
            addCriterion("sa_shiye >", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeGreaterThanOrEqualTo(String value) {
            addCriterion("sa_shiye >=", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeLessThan(String value) {
            addCriterion("sa_shiye <", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeLessThanOrEqualTo(String value) {
            addCriterion("sa_shiye <=", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeLike(String value) {
            addCriterion("sa_shiye like", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeNotLike(String value) {
            addCriterion("sa_shiye not like", value, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeIn(List<String> values) {
            addCriterion("sa_shiye in", values, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeNotIn(List<String> values) {
            addCriterion("sa_shiye not in", values, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeBetween(String value1, String value2) {
            addCriterion("sa_shiye between", value1, value2, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaShiyeNotBetween(String value1, String value2) {
            addCriterion("sa_shiye not between", value1, value2, "saShiye");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinIsNull() {
            addCriterion("sa_gongjijin is null");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinIsNotNull() {
            addCriterion("sa_gongjijin is not null");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinEqualTo(String value) {
            addCriterion("sa_gongjijin =", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinNotEqualTo(String value) {
            addCriterion("sa_gongjijin <>", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinGreaterThan(String value) {
            addCriterion("sa_gongjijin >", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinGreaterThanOrEqualTo(String value) {
            addCriterion("sa_gongjijin >=", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinLessThan(String value) {
            addCriterion("sa_gongjijin <", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinLessThanOrEqualTo(String value) {
            addCriterion("sa_gongjijin <=", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinLike(String value) {
            addCriterion("sa_gongjijin like", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinNotLike(String value) {
            addCriterion("sa_gongjijin not like", value, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinIn(List<String> values) {
            addCriterion("sa_gongjijin in", values, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinNotIn(List<String> values) {
            addCriterion("sa_gongjijin not in", values, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinBetween(String value1, String value2) {
            addCriterion("sa_gongjijin between", value1, value2, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaGongjijinNotBetween(String value1, String value2) {
            addCriterion("sa_gongjijin not between", value1, value2, "saGongjijin");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoIsNull() {
            addCriterion("sa_yangliao is null");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoIsNotNull() {
            addCriterion("sa_yangliao is not null");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoEqualTo(String value) {
            addCriterion("sa_yangliao =", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoNotEqualTo(String value) {
            addCriterion("sa_yangliao <>", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoGreaterThan(String value) {
            addCriterion("sa_yangliao >", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoGreaterThanOrEqualTo(String value) {
            addCriterion("sa_yangliao >=", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoLessThan(String value) {
            addCriterion("sa_yangliao <", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoLessThanOrEqualTo(String value) {
            addCriterion("sa_yangliao <=", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoLike(String value) {
            addCriterion("sa_yangliao like", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoNotLike(String value) {
            addCriterion("sa_yangliao not like", value, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoIn(List<String> values) {
            addCriterion("sa_yangliao in", values, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoNotIn(List<String> values) {
            addCriterion("sa_yangliao not in", values, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoBetween(String value1, String value2) {
            addCriterion("sa_yangliao between", value1, value2, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaYangliaoNotBetween(String value1, String value2) {
            addCriterion("sa_yangliao not between", value1, value2, "saYangliao");
            return (Criteria) this;
        }

        public Criteria andSaShenyuIsNull() {
            addCriterion("sa_shenyu is null");
            return (Criteria) this;
        }

        public Criteria andSaShenyuIsNotNull() {
            addCriterion("sa_shenyu is not null");
            return (Criteria) this;
        }

        public Criteria andSaShenyuEqualTo(String value) {
            addCriterion("sa_shenyu =", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuNotEqualTo(String value) {
            addCriterion("sa_shenyu <>", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuGreaterThan(String value) {
            addCriterion("sa_shenyu >", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuGreaterThanOrEqualTo(String value) {
            addCriterion("sa_shenyu >=", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuLessThan(String value) {
            addCriterion("sa_shenyu <", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuLessThanOrEqualTo(String value) {
            addCriterion("sa_shenyu <=", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuLike(String value) {
            addCriterion("sa_shenyu like", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuNotLike(String value) {
            addCriterion("sa_shenyu not like", value, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuIn(List<String> values) {
            addCriterion("sa_shenyu in", values, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuNotIn(List<String> values) {
            addCriterion("sa_shenyu not in", values, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuBetween(String value1, String value2) {
            addCriterion("sa_shenyu between", value1, value2, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaShenyuNotBetween(String value1, String value2) {
            addCriterion("sa_shenyu not between", value1, value2, "saShenyu");
            return (Criteria) this;
        }

        public Criteria andSaGongshangIsNull() {
            addCriterion("sa_gongshang is null");
            return (Criteria) this;
        }

        public Criteria andSaGongshangIsNotNull() {
            addCriterion("sa_gongshang is not null");
            return (Criteria) this;
        }

        public Criteria andSaGongshangEqualTo(String value) {
            addCriterion("sa_gongshang =", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangNotEqualTo(String value) {
            addCriterion("sa_gongshang <>", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangGreaterThan(String value) {
            addCriterion("sa_gongshang >", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangGreaterThanOrEqualTo(String value) {
            addCriterion("sa_gongshang >=", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangLessThan(String value) {
            addCriterion("sa_gongshang <", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangLessThanOrEqualTo(String value) {
            addCriterion("sa_gongshang <=", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangLike(String value) {
            addCriterion("sa_gongshang like", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangNotLike(String value) {
            addCriterion("sa_gongshang not like", value, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangIn(List<String> values) {
            addCriterion("sa_gongshang in", values, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangNotIn(List<String> values) {
            addCriterion("sa_gongshang not in", values, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangBetween(String value1, String value2) {
            addCriterion("sa_gongshang between", value1, value2, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaGongshangNotBetween(String value1, String value2) {
            addCriterion("sa_gongshang not between", value1, value2, "saGongshang");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoIsNull() {
            addCriterion("sa_yiliao is null");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoIsNotNull() {
            addCriterion("sa_yiliao is not null");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoEqualTo(String value) {
            addCriterion("sa_yiliao =", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoNotEqualTo(String value) {
            addCriterion("sa_yiliao <>", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoGreaterThan(String value) {
            addCriterion("sa_yiliao >", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoGreaterThanOrEqualTo(String value) {
            addCriterion("sa_yiliao >=", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoLessThan(String value) {
            addCriterion("sa_yiliao <", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoLessThanOrEqualTo(String value) {
            addCriterion("sa_yiliao <=", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoLike(String value) {
            addCriterion("sa_yiliao like", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoNotLike(String value) {
            addCriterion("sa_yiliao not like", value, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoIn(List<String> values) {
            addCriterion("sa_yiliao in", values, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoNotIn(List<String> values) {
            addCriterion("sa_yiliao not in", values, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoBetween(String value1, String value2) {
            addCriterion("sa_yiliao between", value1, value2, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaYiliaoNotBetween(String value1, String value2) {
            addCriterion("sa_yiliao not between", value1, value2, "saYiliao");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinIsNull() {
            addCriterion("sa_jiangjin is null");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinIsNotNull() {
            addCriterion("sa_jiangjin is not null");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinEqualTo(String value) {
            addCriterion("sa_jiangjin =", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinNotEqualTo(String value) {
            addCriterion("sa_jiangjin <>", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinGreaterThan(String value) {
            addCriterion("sa_jiangjin >", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinGreaterThanOrEqualTo(String value) {
            addCriterion("sa_jiangjin >=", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinLessThan(String value) {
            addCriterion("sa_jiangjin <", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinLessThanOrEqualTo(String value) {
            addCriterion("sa_jiangjin <=", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinLike(String value) {
            addCriterion("sa_jiangjin like", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinNotLike(String value) {
            addCriterion("sa_jiangjin not like", value, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinIn(List<String> values) {
            addCriterion("sa_jiangjin in", values, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinNotIn(List<String> values) {
            addCriterion("sa_jiangjin not in", values, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinBetween(String value1, String value2) {
            addCriterion("sa_jiangjin between", value1, value2, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaJiangjinNotBetween(String value1, String value2) {
            addCriterion("sa_jiangjin not between", value1, value2, "saJiangjin");
            return (Criteria) this;
        }

        public Criteria andSaFakuanIsNull() {
            addCriterion("sa_fakuan is null");
            return (Criteria) this;
        }

        public Criteria andSaFakuanIsNotNull() {
            addCriterion("sa_fakuan is not null");
            return (Criteria) this;
        }

        public Criteria andSaFakuanEqualTo(String value) {
            addCriterion("sa_fakuan =", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanNotEqualTo(String value) {
            addCriterion("sa_fakuan <>", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanGreaterThan(String value) {
            addCriterion("sa_fakuan >", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanGreaterThanOrEqualTo(String value) {
            addCriterion("sa_fakuan >=", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanLessThan(String value) {
            addCriterion("sa_fakuan <", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanLessThanOrEqualTo(String value) {
            addCriterion("sa_fakuan <=", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanLike(String value) {
            addCriterion("sa_fakuan like", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanNotLike(String value) {
            addCriterion("sa_fakuan not like", value, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanIn(List<String> values) {
            addCriterion("sa_fakuan in", values, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanNotIn(List<String> values) {
            addCriterion("sa_fakuan not in", values, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanBetween(String value1, String value2) {
            addCriterion("sa_fakuan between", value1, value2, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaFakuanNotBetween(String value1, String value2) {
            addCriterion("sa_fakuan not between", value1, value2, "saFakuan");
            return (Criteria) this;
        }

        public Criteria andSaNashuiIsNull() {
            addCriterion("sa_nashui is null");
            return (Criteria) this;
        }

        public Criteria andSaNashuiIsNotNull() {
            addCriterion("sa_nashui is not null");
            return (Criteria) this;
        }

        public Criteria andSaNashuiEqualTo(String value) {
            addCriterion("sa_nashui =", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiNotEqualTo(String value) {
            addCriterion("sa_nashui <>", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiGreaterThan(String value) {
            addCriterion("sa_nashui >", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiGreaterThanOrEqualTo(String value) {
            addCriterion("sa_nashui >=", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiLessThan(String value) {
            addCriterion("sa_nashui <", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiLessThanOrEqualTo(String value) {
            addCriterion("sa_nashui <=", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiLike(String value) {
            addCriterion("sa_nashui like", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiNotLike(String value) {
            addCriterion("sa_nashui not like", value, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiIn(List<String> values) {
            addCriterion("sa_nashui in", values, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiNotIn(List<String> values) {
            addCriterion("sa_nashui not in", values, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiBetween(String value1, String value2) {
            addCriterion("sa_nashui between", value1, value2, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaNashuiNotBetween(String value1, String value2) {
            addCriterion("sa_nashui not between", value1, value2, "saNashui");
            return (Criteria) this;
        }

        public Criteria andSaZongshuIsNull() {
            addCriterion("sa_zongshu is null");
            return (Criteria) this;
        }

        public Criteria andSaZongshuIsNotNull() {
            addCriterion("sa_zongshu is not null");
            return (Criteria) this;
        }

        public Criteria andSaZongshuEqualTo(String value) {
            addCriterion("sa_zongshu =", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuNotEqualTo(String value) {
            addCriterion("sa_zongshu <>", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuGreaterThan(String value) {
            addCriterion("sa_zongshu >", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuGreaterThanOrEqualTo(String value) {
            addCriterion("sa_zongshu >=", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuLessThan(String value) {
            addCriterion("sa_zongshu <", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuLessThanOrEqualTo(String value) {
            addCriterion("sa_zongshu <=", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuLike(String value) {
            addCriterion("sa_zongshu like", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuNotLike(String value) {
            addCriterion("sa_zongshu not like", value, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuIn(List<String> values) {
            addCriterion("sa_zongshu in", values, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuNotIn(List<String> values) {
            addCriterion("sa_zongshu not in", values, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuBetween(String value1, String value2) {
            addCriterion("sa_zongshu between", value1, value2, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andSaZongshuNotBetween(String value1, String value2) {
            addCriterion("sa_zongshu not between", value1, value2, "saZongshu");
            return (Criteria) this;
        }

        public Criteria andShifaIsNull() {
            addCriterion("shifa is null");
            return (Criteria) this;
        }

        public Criteria andShifaIsNotNull() {
            addCriterion("shifa is not null");
            return (Criteria) this;
        }

        public Criteria andShifaEqualTo(String value) {
            addCriterion("shifa =", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotEqualTo(String value) {
            addCriterion("shifa <>", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaGreaterThan(String value) {
            addCriterion("shifa >", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaGreaterThanOrEqualTo(String value) {
            addCriterion("shifa >=", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaLessThan(String value) {
            addCriterion("shifa <", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaLessThanOrEqualTo(String value) {
            addCriterion("shifa <=", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaLike(String value) {
            addCriterion("shifa like", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotLike(String value) {
            addCriterion("shifa not like", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaIn(List<String> values) {
            addCriterion("shifa in", values, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotIn(List<String> values) {
            addCriterion("shifa not in", values, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaBetween(String value1, String value2) {
            addCriterion("shifa between", value1, value2, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotBetween(String value1, String value2) {
            addCriterion("shifa not between", value1, value2, "shifa");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiIsNull() {
            addCriterion("sa_zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiIsNotNull() {
            addCriterion("sa_zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiEqualTo(String value) {
            addCriterion("sa_zhuangtai =", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiNotEqualTo(String value) {
            addCriterion("sa_zhuangtai <>", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiGreaterThan(String value) {
            addCriterion("sa_zhuangtai >", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("sa_zhuangtai >=", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiLessThan(String value) {
            addCriterion("sa_zhuangtai <", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("sa_zhuangtai <=", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiLike(String value) {
            addCriterion("sa_zhuangtai like", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiNotLike(String value) {
            addCriterion("sa_zhuangtai not like", value, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiIn(List<String> values) {
            addCriterion("sa_zhuangtai in", values, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiNotIn(List<String> values) {
            addCriterion("sa_zhuangtai not in", values, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiBetween(String value1, String value2) {
            addCriterion("sa_zhuangtai between", value1, value2, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("sa_zhuangtai not between", value1, value2, "saZhuangtai");
            return (Criteria) this;
        }

        public Criteria andSaTimeIsNull() {
            addCriterion("sa_time is null");
            return (Criteria) this;
        }

        public Criteria andSaTimeIsNotNull() {
            addCriterion("sa_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaTimeEqualTo(String value) {
            addCriterion("sa_time =", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeNotEqualTo(String value) {
            addCriterion("sa_time <>", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeGreaterThan(String value) {
            addCriterion("sa_time >", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sa_time >=", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeLessThan(String value) {
            addCriterion("sa_time <", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeLessThanOrEqualTo(String value) {
            addCriterion("sa_time <=", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeLike(String value) {
            addCriterion("sa_time like", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeNotLike(String value) {
            addCriterion("sa_time not like", value, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeIn(List<String> values) {
            addCriterion("sa_time in", values, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeNotIn(List<String> values) {
            addCriterion("sa_time not in", values, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeBetween(String value1, String value2) {
            addCriterion("sa_time between", value1, value2, "saTime");
            return (Criteria) this;
        }

        public Criteria andSaTimeNotBetween(String value1, String value2) {
            addCriterion("sa_time not between", value1, value2, "saTime");
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