package com.one.ssm.admin.user.login.controller;

import com.one.ssm.admin.user.model.UserLogin;
import com.one.ssm.admin.user.model.UserLoginExample;
import com.one.ssm.admin.user.service.UserLoginService;
import com.one.ssm.util.LoginValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserLoginService userLoginService;

    //进入登录页面
    @GetMapping( "/login")
    public String tologin(){
        return  "/login";
    }

    @RequestMapping("/remember")
    public String remember(Model model, HttpServletResponse response) {

        return "/remember";
    }

    //处理登录
    @PostMapping( "/login")
    @ResponseBody
    public Object login(@RequestBody UserLogin user,
                        Model model, HttpServletRequest request) {
        // 获取用户名和密码
        Integer userId = user.getUserId();
        String password = user.getCurrentPassword();
        //保存登录信息
        Map<String,Object> loginInfo = new HashMap<String,Object>();
        loginInfo.put("loginStatus","400403");//登录失败,返回400403
        loginInfo.put("loginMsg","用户名或密码错误，请重新登录！");//登录失败,返回msg


        // 从数据库中获取用户名和密码后进行判断
        if (userId != null && password != null) {
            UserLoginExample example =new UserLoginExample();
            UserLoginExample.Criteria criteria = example.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<UserLogin> list = userLoginService.selectByExample(example);
            if (list.size() > 0) {
                UserLogin userLogin =list.get(0);
                if (LoginValidate.validate(password, userLogin.getCurrentPassword())) {
                    // 将用户对象添加到Session
                    request.getSession().setAttribute("USER_SESSION", userLogin);
                    //如果登录成功
                    loginInfo.put("loginStatus","200");//登录成功,返回200
                    loginInfo.put("loginMsg","登录成功！");//登录成功
                    loginInfo.put("userInfo",userLogin);
                }
            }
        }
        return loginInfo;
    }

    //退出系统
    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session){
        // 清除Session
        session.invalidate();
        // 重定向到登录页面的跳转方法
        return "200";
    }
}
