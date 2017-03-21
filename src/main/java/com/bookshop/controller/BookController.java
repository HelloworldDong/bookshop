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

import com.bookshop.entity.Book;
import com.bookshop.service.BookService;
@Controller
@RequestMapping(value="/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/showbooks")
    @ResponseBody
    public List<Book> showbooks(){

        return bookService.listAllBooks();

    }
}
