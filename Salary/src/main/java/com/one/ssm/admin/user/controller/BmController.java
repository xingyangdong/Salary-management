package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.*;
import com.one.ssm.admin.user.service.BmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class BmController {
    @Autowired
    BmService bmService;

    @GetMapping("/bm")
    @ResponseBody
    public List<Bm> selectbumen(){
        //1、构造查询条件
        BmExample example = new BmExample();
        //2、创建条件构造器criteria
        BmExample.Criteria criteria = example.createCriteria();
        criteria.andBmIdIsNotNull();
        List<Bm> list = bmService.selectByExample(example);
        return list;

    }

    @PostMapping("/bm")
    @ResponseBody
    public Bm insertbm(@RequestBody Bm bm){//将数据库对象装换成java对象
        bm.setBmTime(String.valueOf(new Timestamp(System.currentTimeMillis())));
        bmService.insertSelective(bm);
        return bm;
    }

}
