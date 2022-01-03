package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.UserLogin;
import com.one.ssm.admin.user.model.UserLoginExample;
import com.one.ssm.admin.user.service.UserLoginService;
import com.one.ssm.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/userlist")
    public String userlist(){
        return "/admin/user_list";
    }
    @GetMapping("/user/{id}")
    @ResponseBody
    public List<UserLogin> seeuser(@PathVariable("id") Integer userId){
        //1、构造查询条件
        UserLoginExample example = new UserLoginExample();
        //2、创建条件构造器criteria
        UserLoginExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserLogin> list = userLoginService.selectByExample(example);
        return list;

    }
    @GetMapping("/user")
    @ResponseBody
    public List<UserLogin> selectUser(){
        //1、构造查询条件
        UserLoginExample example = new UserLoginExample();
        //2、创建条件构造器criteria
        UserLoginExample.Criteria criteria = example.createCriteria();
        //给一个andUserTypeEqualTo=0的条件
        //example.createCriteria().andUserTypeEqualTo("0");
        //3、使用条件
        //criteria.andCurrentStatusNotEqualTo("99");
        criteria.andUserIdIsNotNull();
        List<UserLogin> list = userLoginService.selectByExample(example);

        return list;

    }

    //添加数据
    //设计两个表及以上的数据库操作
    //必须添加事务管理，使用spring的@Transactional注解管理事务

    @PostMapping("/user")
    @ResponseBody
    public UserLogin insertUser(@RequestBody UserLogin userLogin){//将数据库对象装换成java对象
        //密码加密
        userLogin.setCurrentPassword(EncryptUtil.encryptSHA256(userLogin.getCurrentPassword()));
        userLogin.setCurrentStatus("0");//状态：0-可用，1-禁用
        userLogin.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        userLogin.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        userLoginService.insertSelective(userLogin);
        return userLogin;
    }

    @PutMapping("/user")
    @ResponseBody
    public UserLogin updateUser(@RequestBody UserLogin userLogin){
        userLogin.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        userLogin.setCurrentPassword(EncryptUtil.encryptSHA256(userLogin.getCurrentPassword()));
        userLoginService.updateByPrimaryKeySelective(userLogin);
        return userLoginService.selectByPrimaryKey(userLogin.getUserId());
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public String deUser(@PathVariable("id") Integer userId){
        //真删除
        userLoginService.deleteByPrimaryKey(userId);
        return "200";
    }

}
