package dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.UserDao;
import model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
	private static final int PAGE_SIZE = 10;

	public User findByUsername(String username) {
		String hql = "from User u where u.username = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, username);
		return (User) query.uniqueResult();
	}

	public User findByUsernameAndPassword(String username, String password) {
		String hql = "from User u where u.username = ? and u.password = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, username).setParameter(1, password);
		return (User) query.uniqueResult();
	}

	public User findByCode(String code) {
		String hql = "from User u where u.code = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, code);
		return (User) query.uniqueResult();
	}

	public Integer countUser() {
		String hql = "select count(*) from User";
		return count(hql);
	}

	public List<User> findAll(Integer page) {
		String hql = "from User";
		return find(hql, page, PAGE_SIZE);
	}

	public User find(Integer userID) {
		String hql = "from User u where u.uid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, userID);
		return (User) query.uniqueResult();
	}

}
