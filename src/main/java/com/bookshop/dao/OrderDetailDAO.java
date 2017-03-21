package com.bookshop.dao;
import com.bookshop.entity.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository(value="orderDetailDao")
public interface OrderDetailDAO {
	public void addOrderDetail(OrderDetail od);
}



