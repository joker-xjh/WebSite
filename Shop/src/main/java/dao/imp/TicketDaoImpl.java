package dao.imp;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.TicketDao;
import model.Ticket;

@Repository("ticketDao")
@SuppressWarnings("all")
public class TicketDaoImpl extends BaseDaoImpl<Ticket> implements TicketDao{

	public Ticket find(Integer categoryID) {
		String hql = "from Ticket t where t.category.cid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, categoryID);
		return (Ticket) query.uniqueResult();
	}
	
	

}
