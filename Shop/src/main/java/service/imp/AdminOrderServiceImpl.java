package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.OrderDao;
import model.Order;
import service.AdminOrderService;

@Transactional
@Service("adminOrderService")
public class AdminOrderServiceImpl implements AdminOrderService{
	
	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;

	@Transactional(readOnly = true)
	public Order find(Integer orderID) {
		return orderDao.find(orderID);
	}

	public void saveOrUpdate(Order order) {
		orderDao.saveOrUpdate(order);
	}

	public void delete(Order order) {
		orderDao.delete(order);
	}

	@Transactional(readOnly = true)
	public Integer countOrder() {
		return orderDao.countOrder();
	}

	@Transactional(readOnly = true)
	public List<Order> findAll(Integer page, Integer rows) {
		return orderDao.findPage(page, rows);
	}

}
