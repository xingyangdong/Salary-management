package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.Person;
import com.one.ssm.admin.user.model.PersonExample;
import com.one.ssm.admin.user.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonController {
    //方法一：注解注入
    @Autowired
     PersonService personService;
    //方法二：构造函数注入
//    public UserLoginController(UserLoginService userLoginService){
//        this.userLoginService=userLoginService;
//    }
    @GetMapping("/personinformation")
    public String personlist(){
        return "/admin/personinformation_list";
    }
    @GetMapping("/person")
    @ResponseBody
    public List<Person> selectperson(){
        //1、构造查询条件
        PersonExample example = new PersonExample();
        //2、创建条件构造器criteria
        PersonExample.Criteria criteria = example.createCriteria();
        //给一个andUserTypeEqualTo=0的条件
        //example.createCriteria().andUserTypeEqualTo("0");
        //3、使用条件
        criteria.andPersonIdIsNotNull();
        List<Person> list = personService.selectByExample(example);

        return list;

    }

    //添加数据
    //设计两个表及以上的数据库操作
    //必须添加事务管理，使用spring的@Transactional注解管理事务

    @PostMapping("/person")
    @ResponseBody
    public Person insertperson(@RequestBody Person person){//将数据库对象装换成java对象
        personService.insertSelective(person);
        return person;
    }

    @PutMapping("/person")
    @ResponseBody
    public Person updateperson(@RequestBody Person person){
        personService.updateByPrimaryKeySelective(person);
        return personService.selectByPrimaryKey(person.getPersonId());
    }

    @DeleteMapping("/person/{id}")
    @ResponseBody
    public String deperson(@PathVariable("id") Integer personId){
        //真删除
        personService.deleteByPrimaryKey(personId);
        return "200";
    }

}
