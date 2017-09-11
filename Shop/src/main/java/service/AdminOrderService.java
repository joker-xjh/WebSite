package service;

import java.util.List;

import model.Order;

public interface AdminOrderService {
	
	Order find(Integer orderID);
	
	void saveOrUpdate(Order order);
	
	void delete(Order order);
	
	Integer countOrder();
	
	List<Order> findAll(Integer page, Integer rows);

}
