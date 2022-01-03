package com.one.ssm.admin.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Bumen implements Serializable {
    private Integer bumenId;

    private String bumenName;

    private String bumenZhicheng;

    private Integer bumenRenshu;

    private static final long serialVersionUID = 1L;

    public Integer getBumenId() {
        return bumenId;
    }

    public void setBumenId(Integer bumenId) {
        this.bumenId = bumenId;
    }

    public String getBumenName() {
        return bumenName;
    }

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }

    public String getBumenZhicheng() {
        return bumenZhicheng;
    }

    public void setBumenZhicheng(String bumenZhicheng) {
        this.bumenZhicheng = bumenZhicheng;
    }

    public Integer getBumenRenshu() {
        return bumenRenshu;
    }

    public void setBumenRenshu(Integer bumenRenshu) {
        this.bumenRenshu = bumenRenshu;
    }
}