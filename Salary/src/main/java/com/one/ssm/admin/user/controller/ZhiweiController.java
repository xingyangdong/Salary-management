package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.Bm;
import com.one.ssm.admin.user.model.BmExample;
import com.one.ssm.admin.user.model.Zhiwei;
import com.one.ssm.admin.user.model.ZhiweiExample;
import com.one.ssm.admin.user.service.BmService;
import com.one.ssm.admin.user.service.ZhiweiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class ZhiweiController {
    @Autowired
    ZhiweiService zhiweiService;

    @GetMapping("/zhiwei")
    @ResponseBody
    public List<Zhiwei> selectzhiwei(){
        //1、构造查询条件
        ZhiweiExample example = new ZhiweiExample();
        //2、创建条件构造器criteria
        ZhiweiExample.Criteria criteria = example.createCriteria();
        criteria.andZhiweiIdIsNotNull();
        List<Zhiwei> list = zhiweiService.selectByExample(example);
        return list;

    }

    @PostMapping("/zhiwei")
    @ResponseBody
    public Zhiwei insertzhiwei(@RequestBody Zhiwei zhiwei){//将数据库对象装换成java对象
        zhiweiService.insertSelective(zhiwei);
        return zhiwei;
    }
}
