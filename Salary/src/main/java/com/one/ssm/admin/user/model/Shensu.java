package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Shensu implements Serializable {
    /**
     * 申诉单编号
     */
    private Integer shensuId;

    /**
     * 工资编号
     */
    private Long saId;

    /**
     * 员工帐号
     */
    private Integer useId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 申诉内容
     */
    private String shensuNext;

    /**
     * 管理员是否已经操作
     */
    private Integer zhuangtai;

    private static final long serialVersionUID = 1L;

    public Integer getShensuId() {
        return shensuId;
    }

    public void setShensuId(Integer shensuId) {
        this.shensuId = shensuId;
    }

    public Long getSaId() {
        return saId;
    }

    public void setSaId(Long saId) {
        this.saId = saId;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShensuNext() {
        return shensuNext;
    }

    public void setShensuNext(String shensuNext) {
        this.shensuNext = shensuNext;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}