package com.bookshop.service.impl;

import com.bookshop.bean.CartItem;
import com.bookshop.entity.Cart;
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
    Cart cart;

    public void addToCart(CartItem cartItem){

    }
}
