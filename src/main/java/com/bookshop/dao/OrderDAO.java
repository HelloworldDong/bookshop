package com.bookshop.dao;

import java.util.List;


import com.bookshop.entity.Order;
import org.springframework.stereotype.Repository;

@Repository(value="orderDao")
public interface OrderDAO {

	public void addOrder(Order order);
	public  List<Order> showOrder(int userID);
	
}
