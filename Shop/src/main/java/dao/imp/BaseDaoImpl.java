package dao.imp;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.lang.reflect.ParameterizedType;

import dao.BaseDao;

@Repository(value = "baseDao")
@SuppressWarnings("all")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Autowired
	@Qualifier(value = "sessionFactory")
	private SessionFactory sessionFactory;
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	private Class<T> clazz;
	
	
	private Class<T> getClazz() {
		if(clazz == null) {
			clazz = ((Class<T>)
                    (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]));
		}
		return clazz;
	}
	
	
	public Serializable save(T obj) {
		return getCurrentSession().save(obj);
	}

	public boolean delete(Serializable id) {
	    getCurrentSession().delete(id);
		return true;
	}

	public boolean delete(T obj) {
		getCurrentSession().delete(obj);
		return true;
	}

	public boolean update(T obj) {
		getCurrentSession().update(obj);
		return true;
	}

	public boolean saveOrUpdate(T obj) {
		getCurrentSession().saveOrUpdate(obj);
		return true;
	}

	public T get(Serializable id) {
		
		return (T) getCurrentSession().get(getClazz(), id);
	}

	public List<T> find(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		return query.list();
	}

	public List<T> find(String hql, Map<String, Object> params) {
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && !params.isEmpty()) {
			for(String key:params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		return query.list();
	}

	public List<T> find(String hql, Integer page, int rows) {
		Query query = getCurrentSession().createQuery(hql);
		query.setFirstResult((page-1) * rows);
		query.setMaxResults(rows);
		return query.list();
	}

	public List<T> find(String hql, Map<String, Object> params, Integer page, int rows) {
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && !params.isEmpty()) {
			for(String key : params.keySet())
				query.setParameter(key, params.get(key));
		}
		query.setFirstResult((page-1) * rows);
		query.setMaxResults(rows);
		return query.list();
	}

	public Integer count(String hql, Integer id) {
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, id);
		Integer count = (Integer)query.uniqueResult();
		return count;
	}

	public Integer count(String hql, Map<String, Object> params) {
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && !params.isEmpty())
			for(String key : params.keySet())
				query.setParameter(key, params.get(key));
		return (Integer)query.uniqueResult();
	}

	public boolean executeHql(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		int update = query.executeUpdate();
		return update > 0;
	}

	public boolean executeHql(String hql, Map<String, Object> params) {
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && !params.isEmpty())
			for(String key : params.keySet())
				query.setParameter(key, params.get(key));
		int update = query.executeUpdate();
		return update > 0;
	}

	public Integer findByUid(Integer uid) {
		return null;
	}

	public Integer findTicketByCid(Integer cid) {
		return null;
	}


	public Integer count(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		return (Integer) query.uniqueResult();
	}

}
