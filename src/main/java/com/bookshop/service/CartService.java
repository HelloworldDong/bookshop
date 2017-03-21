package com.bookshop.service;

import com.bookshop.bean.CartItem;
import com.bookshop.entity.Cart;
/**
 * Created by dl on 2017/3/19.
 */
public interface CartService {
    public  void  addToCart(CartItem cartItem);
}
