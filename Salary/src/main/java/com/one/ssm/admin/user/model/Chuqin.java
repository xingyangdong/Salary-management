package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Chuqin implements Serializable {
    private Integer chuqinId;

    private String userName;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 打卡状态
     */
    private String zhuangtai;

    /**
     * 打卡时间
     */
    private String dakaTime;

    /**
     * 备注
     */
    private String beizhu;

    private static final long serialVersionUID = 1L;

    public Integer getChuqinId() {
        return chuqinId;
    }

    public void setChuqinId(Integer chuqinId) {
        this.chuqinId = chuqinId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getDakaTime() {
        return dakaTime;
    }

    public void setDakaTime(String dakaTime) {
        this.dakaTime = dakaTime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}