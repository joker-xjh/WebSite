package dao.imp;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.CategoryDao;
import model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {
	
	private static final int PAGE_SIZE = 10;

	public Integer countCategory() {
		String hql = "select count(*) from Category";
		return count(hql);
	}

	public List<Category> findAll() {
		String hql = "from Category";
		return find(hql);
	}

	public List<Category> findAll(Integer pageNow) {
		String hql = "from Category";
		return find(hql, pageNow, PAGE_SIZE);
	}

	public List<Category> findAll(Integer pageNow, Integer pageSize) {
		String hql = "from Category";
		return find(hql, pageNow, PAGE_SIZE);
	}

	public Category find(Integer categoryID) {
		String hql = "from Category c where c.cid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, categoryID);	
		return (Category) query.uniqueResult();
	}

	public Date queryPrivilegeTime(Integer categoryID) {
		return null;
	}
	

}
