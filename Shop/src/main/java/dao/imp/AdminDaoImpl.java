package dao.imp;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.AdminDao;
import model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	public Admin findByAdminUsernameAndPassword(String username, String password) {
		String hql = "from Admin a where a.username = ? and a.password = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		return (Admin)query.uniqueResult();
	}

	public Admin find(Integer adminID) {
		String hql = "from Admin a where a.uid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, adminID);
		return (Admin) query.uniqueResult();
	}

}
