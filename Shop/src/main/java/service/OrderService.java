package service;

import java.util.List;

import model.Order;
import model.OrderItem;

public interface OrderService {
	
	void save(Order order);
	
	List<Order> findByUserID(Integer userID, Integer page);
	Order findByOrderID(Integer orderID);
	
	void updateOrder(Order order);
	
	List<Order> findAll(Integer page);
	
	Integer countOrderByUserID(Integer userID);
	
	List<OrderItem> findOrderItem(Integer orderID);

}
