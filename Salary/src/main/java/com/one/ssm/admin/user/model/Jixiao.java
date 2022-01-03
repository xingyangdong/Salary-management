package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Jixiao implements Serializable {
    /**
     * id
     */
    private Integer xuhao;

    /**
     * 姓名
     */
    private String name;

    /**
     * 员工编号
     */
    private Integer userId;

    /**
     * 年份
     */
    private String year;

    /**
     * 季度
     */
    private String jidu;

    /**
     * 评绩
     */
    private String pingji;

    private static final long serialVersionUID = 1L;

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getJidu() {
        return jidu;
    }

    public void setJidu(String jidu) {
        this.jidu = jidu;
    }

    public String getPingji() {
        return pingji;
    }

    public void setPingji(String pingji) {
        this.pingji = pingji;
    }
}