package com.bookshop.service;

import java.util.List;

import com.bookshop.entity.Order;

public interface OrderService {
	public int addOrder(Order order);
	public  List<Order> showOrder(int userID);
}
