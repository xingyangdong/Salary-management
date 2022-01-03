package com.one.ssm.app.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class PersonalController {

    @RequestMapping("/personal")
    public String personal(Model model, HttpServletResponse response) {
        return "/app/personal_list";
    }


}
