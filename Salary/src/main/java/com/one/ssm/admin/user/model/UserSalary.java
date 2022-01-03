package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class UserSalary implements Serializable {
    /**
     * 工资编号
     */
    private Long saId;

    /**
     * 员工编号
     */
    private Integer userId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 合同性质
     */
    private String xingzhi;

    /**
     * 所属部门
     */
    private String bumenName;

    /**
     * 职称
     */
    private String bumen;

    /**
     * 基本工资
     */
    private String saJiben;

    /**
     * 失业保险
     */
    private String saShiye;

    /**
     * 公积金
     */
    private String saGongjijin;

    /**
     * 养老保险
     */
    private String saYangliao;

    /**
     * 生育保险
     */
    private String saShenyu;

    /**
     * 工伤保险
     */
    private String saGongshang;

    /**
     * 医疗保险
     */
    private String saYiliao;

    /**
     * 奖金
     */
    private String saJiangjin;

    /**
     * 罚款
     */
    private String saFakuan;

    /**
     * 纳税
     */
    private String saNashui;

    /**
     * 总工资
     */
    private String saZongshu;

    /**
     * 实发工资
     */
    private String shifa;

    /**
     * 已发；未发
     */
    private String saZhuangtai;

    /**
     * 发工资时间
     */
    private String saTime;

    private static final long serialVersionUID = 1L;

    public Long getSaId() {
        return saId;
    }

    public void setSaId(Long saId) {
        this.saId = saId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getXingzhi() {
        return xingzhi;
    }

    public void setXingzhi(String xingzhi) {
        this.xingzhi = xingzhi;
    }

    public String getBumenName() {
        return bumenName;
    }

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public String getSaJiben() {
        return saJiben;
    }

    public void setSaJiben(String saJiben) {
        this.saJiben = saJiben;
    }

    public String getSaShiye() {
        return saShiye;
    }

    public void setSaShiye(String saShiye) {
        this.saShiye = saShiye;
    }

    public String getSaGongjijin() {
        return saGongjijin;
    }

    public void setSaGongjijin(String saGongjijin) {
        this.saGongjijin = saGongjijin;
    }

    public String getSaYangliao() {
        return saYangliao;
    }

    public void setSaYangliao(String saYangliao) {
        this.saYangliao = saYangliao;
    }

    public String getSaShenyu() {
        return saShenyu;
    }

    public void setSaShenyu(String saShenyu) {
        this.saShenyu = saShenyu;
    }

    public String getSaGongshang() {
        return saGongshang;
    }

    public void setSaGongshang(String saGongshang) {
        this.saGongshang = saGongshang;
    }

    public String getSaYiliao() {
        return saYiliao;
    }

    public void setSaYiliao(String saYiliao) {
        this.saYiliao = saYiliao;
    }

    public String getSaJiangjin() {
        return saJiangjin;
    }

    public void setSaJiangjin(String saJiangjin) {
        this.saJiangjin = saJiangjin;
    }

    public String getSaFakuan() {
        return saFakuan;
    }

    public void setSaFakuan(String saFakuan) {
        this.saFakuan = saFakuan;
    }

    public String getSaNashui() {
        return saNashui;
    }

    public void setSaNashui(String saNashui) {
        this.saNashui = saNashui;
    }

    public String getSaZongshu() {
        return saZongshu;
    }

    public void setSaZongshu(String saZongshu) {
        this.saZongshu = saZongshu;
    }

    public String getShifa() {
        return shifa;
    }

    public void setShifa(String shifa) {
        this.shifa = shifa;
    }

    public String getSaZhuangtai() {
        return saZhuangtai;
    }

    public void setSaZhuangtai(String saZhuangtai) {
        this.saZhuangtai = saZhuangtai;
    }

    public String getSaTime() {
        return saTime;
    }

    public void setSaTime(String saTime) {
        this.saTime = saTime;
    }
}