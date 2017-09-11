package service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.OrderDao;
import model.Order;
import model.OrderItem;
import service.OrderService;

@Transactional
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;

	public void save(Order order) {
		orderDao.save(order);
	}

	@Transactional(readOnly = true)
	public List<Order> findByUserID(Integer userID, Integer page) {
		return orderDao.findPageByUserID(userID, page, 10);
	}

	@Transactional(readOnly = true)
	public Order findByOrderID(Integer orderID) {
		return orderDao.find(orderID);
	}

	public void updateOrder(Order order) {
		orderDao.update(order);
	}

	@Transactional(readOnly = true)
	public List<Order> findAll(Integer page) {
		return orderDao.findPage(page, 10);
	}

	@Transactional(readOnly = true)
	public Integer countOrderByUserID(Integer userID) {
		return orderDao.countOrder(userID);
	}

	@Transactional(readOnly = true)
	public List<OrderItem> findOrderItem(Integer orderID) {
		return orderDao.findOrderItem(orderID);
	}

}
