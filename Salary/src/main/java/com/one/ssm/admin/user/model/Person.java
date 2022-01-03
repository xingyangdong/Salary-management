package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Person implements Serializable {
    /**
     * 员工编码
     */
    private Integer personId;

    /**
     * 姓名
     */
    private String fullName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 部门
     */
    private String occupation;

    /**
     * 职位
     */
    private String personalTitle;

    /**
     * 身份证号
     */
    private String cardId;

    /**
     * 入职时间
     */
    private String entryDate;

    /**
     * 0-正常；1-删除
     */
    private String currentStatus;

    private static final long serialVersionUID = 1L;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPersonalTitle() {
        return personalTitle;
    }

    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}