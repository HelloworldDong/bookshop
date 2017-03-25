package com.bookshop.controller;

import com.bookshop.entity.User;
import com.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by dl on 2017/3/25.
 */
@Controller
@RequestMapping(value="/user")
public class userController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/show")
    public String showUsers(Map<String,Object> map){
        List<User> users=userService.show();
        map.put("users",users);
        return "users";
    }
}
