package com.one.ssm.admin.user.controller;

import com.one.ssm.admin.user.model.*;
import com.one.ssm.admin.user.service.ChuqinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class ChuqinController {

    @Autowired
    ChuqinService chuqinService;

    @RequestMapping("/adminchuqinlist")
    public String userchuqin(Model model, HttpServletResponse response) {
        return "/admin/chuqin_list";
    }
    @RequestMapping("/appchuqinlist")
    public String chuqin(Model model, HttpServletResponse response) {
        return "/app/seechuqin_list";
    }

    @GetMapping("/chuqin")
    @ResponseBody
    public List<Chuqin> selectChuqin(){
        //1、构造查询条件
        ChuqinExample example = new ChuqinExample();
        //2、创建条件构造器criteria
        ChuqinExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdNotEqualTo(1);
        List<Chuqin> list = chuqinService.selectByExample(example);

        return list;

    }

    @GetMapping("/seechuqin/{id}")
    @ResponseBody
    public List<Chuqin> seeChuqin(@PathVariable("id") Integer userId){
        //1、构造查询条件
        ChuqinExample example = new ChuqinExample();
        //2、创建条件构造器criteria
        ChuqinExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Chuqin> list = chuqinService.selectByExample(example);

        return list;

    }

    @PostMapping("/chuqin")
    @ResponseBody
    public Chuqin insertChuqin(@RequestBody Chuqin chuqin){//将数据库对象装换成java对象
        chuqin.setDakaTime(String.valueOf(new Timestamp(System.currentTimeMillis())));
        chuqinService.insertSelective(chuqin);
        return chuqin;
    }

}
