package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.UserSalary;
import com.one.ssm.admin.user.model.UserSalaryExample;
import com.one.ssm.admin.user.service.UserSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserSalaryController {
    @Autowired
    UserSalaryService userSalaryService;

    @RequestMapping("/usersalary")
    public String usersalary(Model model, HttpServletResponse response) {
        return "/admin/usersalary_list";
    }

    @GetMapping("/salary")
    @ResponseBody
    public List<UserSalary> selectUserSalary(){
        //1、构造查询条件
        UserSalaryExample example = new UserSalaryExample();
        //2、创建条件构造器criteria
        UserSalaryExample.Criteria criteria = example.createCriteria();
        criteria.andSaIdNotEqualTo(Long.valueOf(1));
        List<UserSalary> list = userSalaryService.selectByExample(example);

        return list;

    }

    @PostMapping("/salary")
    @ResponseBody
    public UserSalary insertUserSalary(@RequestBody UserSalary userSalary){//将数据库对象装换成java对象
        userSalaryService.insertSelective(userSalary);
        return userSalary;
    }

    @PutMapping("/salary")
    @ResponseBody
    public UserSalary updateUserSalary(@RequestBody UserSalary userSalary){
        userSalaryService.updateByPrimaryKeySelective(userSalary);
        return userSalaryService.selectByPrimaryKey(userSalary.getSaId());
    }

    @DeleteMapping("/salary/{id}")
    @ResponseBody
    public String deUserSalary(@PathVariable("id") Long saId){
        //真删除
        userSalaryService.deleteByPrimaryKey(saId);
        return "200";
    }


}
