package com.one.ssm.admin.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserLoginExample() {
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

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIsNull() {
            addCriterion("current_password is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIsNotNull() {
            addCriterion("current_password is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordEqualTo(String value) {
            addCriterion("current_password =", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotEqualTo(String value) {
            addCriterion("current_password <>", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordGreaterThan(String value) {
            addCriterion("current_password >", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("current_password >=", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLessThan(String value) {
            addCriterion("current_password <", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLessThanOrEqualTo(String value) {
            addCriterion("current_password <=", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordLike(String value) {
            addCriterion("current_password like", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotLike(String value) {
            addCriterion("current_password not like", value, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordIn(List<String> values) {
            addCriterion("current_password in", values, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotIn(List<String> values) {
            addCriterion("current_password not in", values, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordBetween(String value1, String value2) {
            addCriterion("current_password between", value1, value2, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPasswordNotBetween(String value1, String value2) {
            addCriterion("current_password not between", value1, value2, "currentPassword");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2IsNull() {
            addCriterion("current_password2 is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2IsNotNull() {
            addCriterion("current_password2 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2EqualTo(String value) {
            addCriterion("current_password2 =", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2NotEqualTo(String value) {
            addCriterion("current_password2 <>", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2GreaterThan(String value) {
            addCriterion("current_password2 >", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2GreaterThanOrEqualTo(String value) {
            addCriterion("current_password2 >=", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2LessThan(String value) {
            addCriterion("current_password2 <", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2LessThanOrEqualTo(String value) {
            addCriterion("current_password2 <=", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2Like(String value) {
            addCriterion("current_password2 like", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2NotLike(String value) {
            addCriterion("current_password2 not like", value, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2In(List<String> values) {
            addCriterion("current_password2 in", values, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2NotIn(List<String> values) {
            addCriterion("current_password2 not in", values, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2Between(String value1, String value2) {
            addCriterion("current_password2 between", value1, value2, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andCurrentPassword2NotBetween(String value1, String value2) {
            addCriterion("current_password2 not between", value1, value2, "currentPassword2");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIsNull() {
            addCriterion("password_hint is null");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIsNotNull() {
            addCriterion("password_hint is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordHintEqualTo(Integer value) {
            addCriterion("password_hint =", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotEqualTo(Integer value) {
            addCriterion("password_hint <>", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintGreaterThan(Integer value) {
            addCriterion("password_hint >", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintGreaterThanOrEqualTo(Integer value) {
            addCriterion("password_hint >=", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintLessThan(Integer value) {
            addCriterion("password_hint <", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintLessThanOrEqualTo(Integer value) {
            addCriterion("password_hint <=", value, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintIn(List<Integer> values) {
            addCriterion("password_hint in", values, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotIn(List<Integer> values) {
            addCriterion("password_hint not in", values, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintBetween(Integer value1, Integer value2) {
            addCriterion("password_hint between", value1, value2, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordHintNotBetween(Integer value1, Integer value2) {
            addCriterion("password_hint not between", value1, value2, "passwordHint");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeIsNull() {
            addCriterion("password_require_change is null");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeIsNotNull() {
            addCriterion("password_require_change is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeEqualTo(String value) {
            addCriterion("password_require_change =", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeNotEqualTo(String value) {
            addCriterion("password_require_change <>", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeGreaterThan(String value) {
            addCriterion("password_require_change >", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeGreaterThanOrEqualTo(String value) {
            addCriterion("password_require_change >=", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeLessThan(String value) {
            addCriterion("password_require_change <", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeLessThanOrEqualTo(String value) {
            addCriterion("password_require_change <=", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeLike(String value) {
            addCriterion("password_require_change like", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeNotLike(String value) {
            addCriterion("password_require_change not like", value, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeIn(List<String> values) {
            addCriterion("password_require_change in", values, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeNotIn(List<String> values) {
            addCriterion("password_require_change not in", values, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeBetween(String value1, String value2) {
            addCriterion("password_require_change between", value1, value2, "passwordRequireChange");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireChangeNotBetween(String value1, String value2) {
            addCriterion("password_require_change not between", value1, value2, "passwordRequireChange");
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

        public Criteria andLastNameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("last_name =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("last_name >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("last_name <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("last_name like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("last_name not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("last_name in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andIsInternalIsNull() {
            addCriterion("is_internal is null");
            return (Criteria) this;
        }

        public Criteria andIsInternalIsNotNull() {
            addCriterion("is_internal is not null");
            return (Criteria) this;
        }

        public Criteria andIsInternalEqualTo(String value) {
            addCriterion("is_internal =", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotEqualTo(String value) {
            addCriterion("is_internal <>", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalGreaterThan(String value) {
            addCriterion("is_internal >", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalGreaterThanOrEqualTo(String value) {
            addCriterion("is_internal >=", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalLessThan(String value) {
            addCriterion("is_internal <", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalLessThanOrEqualTo(String value) {
            addCriterion("is_internal <=", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalLike(String value) {
            addCriterion("is_internal like", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotLike(String value) {
            addCriterion("is_internal not like", value, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalIn(List<String> values) {
            addCriterion("is_internal in", values, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotIn(List<String> values) {
            addCriterion("is_internal not in", values, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalBetween(String value1, String value2) {
            addCriterion("is_internal between", value1, value2, "isInternal");
            return (Criteria) this;
        }

        public Criteria andIsInternalNotBetween(String value1, String value2) {
            addCriterion("is_internal not between", value1, value2, "isInternal");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIsNull() {
            addCriterion("mobile_country_code is null");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIsNotNull() {
            addCriterion("mobile_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeEqualTo(String value) {
            addCriterion("mobile_country_code =", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotEqualTo(String value) {
            addCriterion("mobile_country_code <>", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeGreaterThan(String value) {
            addCriterion("mobile_country_code >", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_country_code >=", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLessThan(String value) {
            addCriterion("mobile_country_code <", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("mobile_country_code <=", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeLike(String value) {
            addCriterion("mobile_country_code like", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotLike(String value) {
            addCriterion("mobile_country_code not like", value, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeIn(List<String> values) {
            addCriterion("mobile_country_code in", values, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotIn(List<String> values) {
            addCriterion("mobile_country_code not in", values, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeBetween(String value1, String value2) {
            addCriterion("mobile_country_code between", value1, value2, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andMobileCountryCodeNotBetween(String value1, String value2) {
            addCriterion("mobile_country_code not between", value1, value2, "mobileCountryCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIsNull() {
            addCriterion("has_logged_out is null");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIsNotNull() {
            addCriterion("has_logged_out is not null");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutEqualTo(String value) {
            addCriterion("has_logged_out =", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotEqualTo(String value) {
            addCriterion("has_logged_out <>", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutGreaterThan(String value) {
            addCriterion("has_logged_out >", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutGreaterThanOrEqualTo(String value) {
            addCriterion("has_logged_out >=", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLessThan(String value) {
            addCriterion("has_logged_out <", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLessThanOrEqualTo(String value) {
            addCriterion("has_logged_out <=", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutLike(String value) {
            addCriterion("has_logged_out like", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotLike(String value) {
            addCriterion("has_logged_out not like", value, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutIn(List<String> values) {
            addCriterion("has_logged_out in", values, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotIn(List<String> values) {
            addCriterion("has_logged_out not in", values, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutBetween(String value1, String value2) {
            addCriterion("has_logged_out between", value1, value2, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andHasLoggedOutNotBetween(String value1, String value2) {
            addCriterion("has_logged_out not between", value1, value2, "hasLoggedOut");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIsNull() {
            addCriterion("last_locale is null");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIsNotNull() {
            addCriterion("last_locale is not null");
            return (Criteria) this;
        }

        public Criteria andLastLocaleEqualTo(String value) {
            addCriterion("last_locale =", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotEqualTo(String value) {
            addCriterion("last_locale <>", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleGreaterThan(String value) {
            addCriterion("last_locale >", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("last_locale >=", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLessThan(String value) {
            addCriterion("last_locale <", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLessThanOrEqualTo(String value) {
            addCriterion("last_locale <=", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleLike(String value) {
            addCriterion("last_locale like", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotLike(String value) {
            addCriterion("last_locale not like", value, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleIn(List<String> values) {
            addCriterion("last_locale in", values, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotIn(List<String> values) {
            addCriterion("last_locale not in", values, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleBetween(String value1, String value2) {
            addCriterion("last_locale between", value1, value2, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastLocaleNotBetween(String value1, String value2) {
            addCriterion("last_locale not between", value1, value2, "lastLocale");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIsNull() {
            addCriterion("last_time_zone is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIsNotNull() {
            addCriterion("last_time_zone is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneEqualTo(String value) {
            addCriterion("last_time_zone =", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotEqualTo(String value) {
            addCriterion("last_time_zone <>", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneGreaterThan(String value) {
            addCriterion("last_time_zone >", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("last_time_zone >=", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLessThan(String value) {
            addCriterion("last_time_zone <", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("last_time_zone <=", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneLike(String value) {
            addCriterion("last_time_zone like", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotLike(String value) {
            addCriterion("last_time_zone not like", value, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneIn(List<String> values) {
            addCriterion("last_time_zone in", values, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotIn(List<String> values) {
            addCriterion("last_time_zone not in", values, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneBetween(String value1, String value2) {
            addCriterion("last_time_zone between", value1, value2, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andLastTimeZoneNotBetween(String value1, String value2) {
            addCriterion("last_time_zone not between", value1, value2, "lastTimeZone");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("current_status like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("current_status not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIsNull() {
            addCriterion("disabled_time is null");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIsNotNull() {
            addCriterion("disabled_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeEqualTo(Date value) {
            addCriterion("disabled_time =", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotEqualTo(Date value) {
            addCriterion("disabled_time <>", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeGreaterThan(Date value) {
            addCriterion("disabled_time >", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("disabled_time >=", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeLessThan(Date value) {
            addCriterion("disabled_time <", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeLessThanOrEqualTo(Date value) {
            addCriterion("disabled_time <=", value, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeIn(List<Date> values) {
            addCriterion("disabled_time in", values, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotIn(List<Date> values) {
            addCriterion("disabled_time not in", values, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeBetween(Date value1, Date value2) {
            addCriterion("disabled_time between", value1, value2, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledTimeNotBetween(Date value1, Date value2) {
            addCriterion("disabled_time not between", value1, value2, "disabledTime");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNull() {
            addCriterion("disabled_by is null");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNotNull() {
            addCriterion("disabled_by is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledByEqualTo(String value) {
            addCriterion("disabled_by =", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotEqualTo(String value) {
            addCriterion("disabled_by <>", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThan(String value) {
            addCriterion("disabled_by >", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThanOrEqualTo(String value) {
            addCriterion("disabled_by >=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThan(String value) {
            addCriterion("disabled_by <", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThanOrEqualTo(String value) {
            addCriterion("disabled_by <=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLike(String value) {
            addCriterion("disabled_by like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotLike(String value) {
            addCriterion("disabled_by not like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByIn(List<String> values) {
            addCriterion("disabled_by in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotIn(List<String> values) {
            addCriterion("disabled_by not in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByBetween(String value1, String value2) {
            addCriterion("disabled_by between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotBetween(String value1, String value2) {
            addCriterion("disabled_by not between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdIsNull() {
            addCriterion("created_user_login_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdIsNotNull() {
            addCriterion("created_user_login_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdEqualTo(String value) {
            addCriterion("created_user_login_id =", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdNotEqualTo(String value) {
            addCriterion("created_user_login_id <>", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdGreaterThan(String value) {
            addCriterion("created_user_login_id >", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("created_user_login_id >=", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdLessThan(String value) {
            addCriterion("created_user_login_id <", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("created_user_login_id <=", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdLike(String value) {
            addCriterion("created_user_login_id like", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdNotLike(String value) {
            addCriterion("created_user_login_id not like", value, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdIn(List<String> values) {
            addCriterion("created_user_login_id in", values, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdNotIn(List<String> values) {
            addCriterion("created_user_login_id not in", values, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdBetween(String value1, String value2) {
            addCriterion("created_user_login_id between", value1, value2, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("created_user_login_id not between", value1, value2, "createdUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNull() {
            addCriterion("last_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNotNull() {
            addCriterion("last_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeEqualTo(Date value) {
            addCriterion("last_updated_time =", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotEqualTo(Date value) {
            addCriterion("last_updated_time <>", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThan(Date value) {
            addCriterion("last_updated_time >", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updated_time >=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThan(Date value) {
            addCriterion("last_updated_time <", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_updated_time <=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIn(List<Date> values) {
            addCriterion("last_updated_time in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotIn(List<Date> values) {
            addCriterion("last_updated_time not in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("last_updated_time between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_updated_time not between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdIsNull() {
            addCriterion("last_updated_user_login_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdIsNotNull() {
            addCriterion("last_updated_user_login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdEqualTo(String value) {
            addCriterion("last_updated_user_login_id =", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdNotEqualTo(String value) {
            addCriterion("last_updated_user_login_id <>", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdGreaterThan(String value) {
            addCriterion("last_updated_user_login_id >", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_updated_user_login_id >=", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdLessThan(String value) {
            addCriterion("last_updated_user_login_id <", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("last_updated_user_login_id <=", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdLike(String value) {
            addCriterion("last_updated_user_login_id like", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdNotLike(String value) {
            addCriterion("last_updated_user_login_id not like", value, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdIn(List<String> values) {
            addCriterion("last_updated_user_login_id in", values, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdNotIn(List<String> values) {
            addCriterion("last_updated_user_login_id not in", values, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdBetween(String value1, String value2) {
            addCriterion("last_updated_user_login_id between", value1, value2, "lastUpdatedUserLoginId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("last_updated_user_login_id not between", value1, value2, "lastUpdatedUserLoginId");
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