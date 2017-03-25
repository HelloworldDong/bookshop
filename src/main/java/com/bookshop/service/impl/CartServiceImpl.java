package com.bookshop.service.impl;

import com.bookshop.bean.Cart;
import com.bookshop.entity.Book;
import com.bookshop.service.BookService;
import com.bookshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by dl on 2017/3/19.
 */
@Service(value = "cartService")
@Transactional
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartServiceImpl implements CartService {
    Cart mycart;

    @Autowired
    BookService bookService;
    public void add(Cart cart,int book_id){

        Book book= bookService.find(book_id);
        cart.add(book);
    }
}
