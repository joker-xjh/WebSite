package dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.OrderDao;
import model.Order;
import model.OrderItem;

@Repository("orderDao")
@SuppressWarnings("all")
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao{

	public Integer countOrder() {
		String hql = "select count(*) from Order";
		return count(hql);
	}

	public Integer countOrder(Integer userID) {
		String hql = "select count(*) from Order o where o.user.uid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, userID);
		return (Integer) query.uniqueResult();
	}

	public List<Order> findPage(Integer begin, Integer limit) {
		String hql = "from Order o order by o.orderTime desc";
		return find(hql, begin, limit);
	}

	
	public List<Order> findPageByUserID(Integer userID, Integer begin, Integer limit) {
		String hql = "from Order o where o.user.uid = ? order by o.orderTime desc";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, userID);
		query.setFirstResult((begin-1) * limit).setMaxResults(limit);
		return query.list();
	}

	public Order find(Integer orderID) {
		String hql = "from Order o where o.oid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, orderID);
		return (Order) query.uniqueResult();
	}

	public List<OrderItem> findOrderItem(Integer orderID) {
		String hql = "from OrderItem oi where oi.order.oid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, orderID);
		List<OrderItem> list = query.list();
		return list;
	}

}
