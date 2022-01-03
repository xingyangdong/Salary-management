package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.Jixiao;
import com.one.ssm.admin.user.model.JixiaoExample;
import com.one.ssm.admin.user.model.UserLogin;
import com.one.ssm.admin.user.model.UserLoginExample;
import com.one.ssm.admin.user.service.ChuqinService;
import com.one.ssm.admin.user.service.JixiaoService;
import com.one.ssm.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class JixiaoController {

    @Autowired
    JixiaoService jixiaoService;

    @RequestMapping("/jixiaolist")
    public String jixiao(){
        return "/admin/jixiao_list";
    }
    @RequestMapping("/seejixiaolist")
    public String seejixiao(){
        return "/app/seejixiao_list";
    }


    @GetMapping("/jixiao")
    @ResponseBody
    public List<Jixiao> selectJixiao(){
        //1、构造查询条件
        JixiaoExample example = new JixiaoExample();
        //2、创建条件构造器criteria
        JixiaoExample.Criteria criteria = example.createCriteria();
        criteria.andXuhaoNotEqualTo(0);
        List<Jixiao> list = jixiaoService.selectByExample(example);
        return list;

    }

    @GetMapping("/jixiao/{id}")
    @ResponseBody
    public List<Jixiao> seeJixiao(@PathVariable("id") Integer userId){
        //1、构造查询条件
        JixiaoExample example = new JixiaoExample();
        //2、创建条件构造器criteria
        JixiaoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Jixiao> list = jixiaoService.selectByExample(example);
        return list;

    }
    //添加数据
    //设计两个表及以上的数据库操作
    //必须添加事务管理，使用spring的@Transactional注解管理事务

    @PostMapping("/jixiao")
    @ResponseBody
    public Jixiao insertJixiao(@RequestBody Jixiao jixiao){//将数据库对象装换成java对象
        //密码加密
        jixiaoService.insertSelective(jixiao);
        return jixiao;
    }

    @PutMapping("/jixiao")
    @ResponseBody
    public Jixiao updateJixiao(@RequestBody Jixiao jixiao){
        jixiaoService.updateByPrimaryKeySelective(jixiao);
        return jixiaoService.selectByPrimaryKey(jixiao.getXuhao());
    }

    @DeleteMapping("/jixiao/{id}")
    @ResponseBody
    public String deJixiao(@PathVariable("id") Integer xuhao){
        //真删除
        jixiaoService.deleteByPrimaryKey(xuhao);
        return "200";
    }



}
