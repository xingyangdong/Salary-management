package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.Shensu;
import com.one.ssm.admin.user.model.ShensuExample;
import com.one.ssm.admin.user.model.UserSalary;
import com.one.ssm.admin.user.model.UserSalaryExample;
import com.one.ssm.admin.user.service.ShensuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ShenSuController {

    @Autowired
    ShensuService shensuService;

    @GetMapping("/shensulist")
    public String shensulist(){
        return "/app/shensu_list";
    }
    @GetMapping("/seeshensulist")
    public String seeshensulist(){
        return "/admin/seeshensu_list";
    }
    @GetMapping("/shensu")
    @ResponseBody
    public List<Shensu> selectShensu(){
        //1、构造查询条件
        ShensuExample example = new ShensuExample();
        //2、创建条件构造器criteria
        ShensuExample.Criteria criteria = example.createCriteria();
        criteria.andShensuIdNotEqualTo(0);
        List<Shensu> list = shensuService.selectByExample(example);

        return list;

    }

    @PostMapping("/shensu")
    @ResponseBody
    public Shensu insertshensu(@RequestBody Shensu shensu){//将数据库对象装换成java对象
        shensuService.insertSelective(shensu);
        return shensu;
    }

    @PutMapping("/shensu")
    @ResponseBody
    public Shensu updateShensu(@RequestBody Shensu shensu){
        shensu.setZhuangtai(1);
        shensuService.updateByPrimaryKeySelective(shensu);
        return shensuService.selectByPrimaryKey(shensu.getShensuId());
    }

    @GetMapping("/shensu/{id}")
    @ResponseBody
    public List<Shensu> selectShensu(@PathVariable("id") Integer userId){
        //1、构造查询条件
        ShensuExample example = new ShensuExample();
        //2、创建条件构造器criteria
        ShensuExample.Criteria criteria = example.createCriteria();
        criteria.andUseIdEqualTo(userId);
        List<Shensu> list = shensuService.selectByExample(example);
        return list;
    }

}
