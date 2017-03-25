package com.bookshop.controller;


import com.bookshop.service.CartService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bookshop.bean.Cart;
/**
 * Created by dl on 2017/3/19.
 */
@Controller
@RequestMapping(value="cart")
public class cartController {
    @Autowired
    CartService cartService;

    @RequestMapping(value="add")
    public String add(@RequestParam(value="book_id")int book_id, HttpServletSession session){
        Cart cart=(Cart)session.getAttribute("cart");
        cartService.add(cart,book_id);

        return "redirect:/cart.jsp";
    }
}
