package dao.imp;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.PacketDao;
import model.Packet;

@Repository("packetDao")
public class PacketDaoImpl extends BaseDaoImpl<Packet> implements PacketDao{

	public Packet findByUserID(Integer userID) {
		String hql = "from Packet p where p.user.uid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, userID);
		return (Packet) query.uniqueResult();
	}

}
