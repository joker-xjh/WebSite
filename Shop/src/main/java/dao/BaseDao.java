package dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T>{
	
	Serializable save(T obj);
	
	boolean delete(Serializable id);
	boolean delete(T obj);
	
	boolean update(T obj);
	boolean saveOrUpdate(T obj);
	
	T get(Serializable id);
	
	List<T> find(String hql);
	List<T> find(String hql, Map<String, Object> params);
	List<T> find(String hql, Integer page, int rows);
	List<T> find(String hql, Map<String, Object> params, Integer page, int rows);
	
	Integer count(String hql, Integer id);

	Integer count(String hql, Map<String, Object> params);

	boolean executeHql(String hql);

	boolean executeHql(String hql, Map<String, Object> params);

	Integer findByUid(Integer uid);

	Integer findTicketByCid(Integer cid);
	
	
	

}
