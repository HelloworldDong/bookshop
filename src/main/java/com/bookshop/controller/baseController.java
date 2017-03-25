package com.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dl on 2017/3/24.
 */
@Controller
public class baseController {
    @RequestMapping(value="/")
    public String startpage(){
        return "redirect:/index.jsp";
    }
}
