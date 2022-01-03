package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Zhiwei implements Serializable {
    /**
     * 职位编号
     */
    private Integer zhiweiId;

    private String zhiweiName;

    private String bumenName;

    private static final long serialVersionUID = 1L;

    public Integer getZhiweiId() {
        return zhiweiId;
    }

    public void setZhiweiId(Integer zhiweiId) {
        this.zhiweiId = zhiweiId;
    }

    public String getZhiweiName() {
        return zhiweiName;
    }

    public void setZhiweiName(String zhiweiName) {
        this.zhiweiName = zhiweiName;
    }

    public String getBumenName() {
        return bumenName;
    }

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }
}