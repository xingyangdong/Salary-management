package com.one.ssm.util;

import com.one.ssm.admin.user.model.UserLogin;

import javax.servlet.http.HttpServletRequest;

public class UserLoginUtil {
    //从session获得登录用户信息,如果获得不了,默认设置为系统管理员
    public final static UserLogin getUserLogin(HttpServletRequest request){
        UserLogin userLogin = new UserLogin();
        if(null != request.getSession().getAttribute("USER_SESSION")){
            userLogin = (UserLogin)request.getSession().getAttribute("USER_SESSION");
        }else{
            userLogin.setUserId(20210001);
            userLogin.setUserName("系统管理员");
        }
        return userLogin;
    }
}
