package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Bm implements Serializable {
    private Integer bmId;

    private String bmTime;

    private String bmFuze;

    private String bmName;

    private static final long serialVersionUID = 1L;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getBmTime() {
        return bmTime;
    }

    public void setBmTime(String bmTime) {
        this.bmTime = bmTime;
    }

    public String getBmFuze() {
        return bmFuze;
    }

    public void setBmFuze(String bmFuze) {
        this.bmFuze = bmFuze;
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }
}