package com.one.ssm.app.user.controller;

import com.one.ssm.admin.user.model.UserSalary;
import com.one.ssm.admin.user.model.UserSalaryExample;
import com.one.ssm.admin.user.service.UserSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SeeSalaryController {
    @Autowired
    UserSalaryService userSalaryService;

    @RequestMapping("/seesalarylist")
    public String seesalary(Model model, HttpServletResponse response) {
        return "/app/seesalary_list";
    }

    @GetMapping("/seesalary/{id}")
    @ResponseBody
    public List<UserSalary> selectseeUserSalary(@PathVariable("id") Integer userId){
        //1、构造查询条件
        UserSalaryExample example = new UserSalaryExample();
        //2、创建条件构造器criteria
        UserSalaryExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserSalary> list = userSalaryService.selectByExample(example);

        return list;

    }
}
