package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.Bumen;
import com.one.ssm.admin.user.model.BumenExample;
import com.one.ssm.admin.user.service.BumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BumenController {
    @Autowired
    BumenService bumenService;

    @GetMapping("/bumenlist")
    public String bumenlist(){
        return "/admin/bumen_list";
    }

    @GetMapping("/bumen")
    @ResponseBody
    public List<Bumen> selectbumen(){
        //1、构造查询条件
        BumenExample example = new BumenExample();
        //2、创建条件构造器criteria
        BumenExample.Criteria criteria = example.createCriteria();
        //给一个andUserTypeEqualTo=0的条件
        //example.createCriteria().andUserTypeEqualTo("0");
        //3、使用条件
        criteria.andBumenIdIsNotNull();
        List<Bumen> list = bumenService.selectByExample(example);

        return list;

    }

    @GetMapping("/bumenselect")
    @ResponseBody
    public List<String> selectbumenchoose(){
        List<String> list = bumenService.select();
        return list;
    }

    //添加数据
    //设计两个表及以上的数据库操作
    //必须添加事务管理，使用spring的@Transactional注解管理事务

    @PostMapping("/bumen")
    @ResponseBody
    public Bumen insertbumen(@RequestBody Bumen bumen){//将数据库对象装换成java对象
        bumenService.insertSelective(bumen);
        return bumen;
    }

    @PutMapping("/bumen")
    @ResponseBody
    public Bumen updatebumen(@RequestBody Bumen person){
        bumenService.updateByPrimaryKeySelective(person);
        return bumenService.selectByPrimaryKey(person.getBumenId());
    }

    @DeleteMapping("/bumen/{id}")
    @ResponseBody
    public String debumen(@PathVariable("id") Integer bumenId){
        //真删除
        bumenService.deleteByPrimaryKey(bumenId);
        return "200";
    }

}
