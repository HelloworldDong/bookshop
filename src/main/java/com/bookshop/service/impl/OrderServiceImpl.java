package com.service.impl;

import java.util.List;

import com.bookshop.entity.Order;
import com.bookshop.dao.OrderDAO;
import com.bookshop.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	public OrderServiceImpl(){}
	
	private OrderDAO OrderDAO;
	
	public OrderDAO getOrderDAO() {
		return OrderDAO;
	}
	public void setOrderDAO(OrderDAO OrderDAO) {
		this.OrderDAO = OrderDAO;
	}
	
	public int addOrder(Order Order) {
		this.OrderDAO.addOrder(Order);
		return Order.getId();
	}
	public  List<Order> showOrder(int userID){
		return  OrderDAO.showOrder(userID);
	}
	
}
