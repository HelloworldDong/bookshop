package com.bookshop.controller;

/**
 * Created by dl on 2017/3/15.
 */

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.entity.User;
import com.bookshop.service.UserService;
@Controller
@RequestMapping(value="/log")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(){
     return "redirect:/userpage.jsp";
    }
}
