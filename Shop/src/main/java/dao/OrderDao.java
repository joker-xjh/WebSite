package dao;

import java.util.List;

import model.Order;
import model.OrderItem;

public interface OrderDao extends BaseDao<Order>{
	
	Integer countOrder();
	Integer countOrder(Integer userID);
	
	List<Order> findPage(Integer begin, Integer limit);
	List<Order> findPageByUserID(Integer userID, Integer begin, Integer limit);
	Order find(Integer orderID);
	
	List<OrderItem> findOrderItem(Integer orderID);

}
