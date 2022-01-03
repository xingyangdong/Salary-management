package com.one.ssm.admin.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class UserLogin implements Serializable {
    private Integer userId;

    /**
     * 账号类型：0-人员；1-组织
     */
    private String accountType;

    private String currentPassword;

    private String currentPassword2;

    private Integer passwordHint;

    /**
     * require_password_change：0-不需要；1-需要
     */
    private String passwordRequireChange;

    private String userName;

    private String lastName;

    private String firstName;

    /**
     * 0-否；1-是
     */
    private String isInternal;

    private String email;

    private String mobile;

    private String mobileCountryCode;

    /**
     * 用户类型：0-系统管理员；1-学生；2-老师；4-行政；8-...
     */
    private String userType;

    /**
     * has_logged_out：0-否；1-是
     */
    private String hasLoggedOut;

    private String lastLocale;

    private String lastTimeZone;

    /**
     * 0-正常；1-禁用
     */
    private String currentStatus;

    private Date disabledTime;

    /**
     * disabled_by：（user_login_id）
     */
    private String disabledBy;

    private Date createdTime;

    private String createdUserLoginId;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLoginId;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getCurrentPassword2() {
        return currentPassword2;
    }

    public void setCurrentPassword2(String currentPassword2) {
        this.currentPassword2 = currentPassword2;
    }

    public Integer getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(Integer passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getPasswordRequireChange() {
        return passwordRequireChange;
    }

    public void setPasswordRequireChange(String passwordRequireChange) {
        this.passwordRequireChange = passwordRequireChange;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIsInternal() {
        return isInternal;
    }

    public void setIsInternal(String isInternal) {
        this.isInternal = isInternal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getHasLoggedOut() {
        return hasLoggedOut;
    }

    public void setHasLoggedOut(String hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut;
    }

    public String getLastLocale() {
        return lastLocale;
    }

    public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale;
    }

    public String getLastTimeZone() {
        return lastTimeZone;
    }

    public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Date getDisabledTime() {
        return disabledTime;
    }

    public void setDisabledTime(Date disabledTime) {
        this.disabledTime = disabledTime;
    }

    public String getDisabledBy() {
        return disabledBy;
    }

    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUserLoginId() {
        return createdUserLoginId;
    }

    public void setCreatedUserLoginId(String createdUserLoginId) {
        this.createdUserLoginId = createdUserLoginId;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getLastUpdatedUserLoginId() {
        return lastUpdatedUserLoginId;
    }

    public void setLastUpdatedUserLoginId(String lastUpdatedUserLoginId) {
        this.lastUpdatedUserLoginId = lastUpdatedUserLoginId;
    }
}