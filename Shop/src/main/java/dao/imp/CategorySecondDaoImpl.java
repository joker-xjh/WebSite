package dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.CategorySecondDao;
import model.CategorySecond;

@Repository("categorySecondDao")
public class CategorySecondDaoImpl extends BaseDaoImpl<CategorySecond> implements CategorySecondDao{
	
	private static final int PAGE_SIZE = 15;

	public Integer countCategorySecond() {
		String hql = "select count(*) from CategorySecond";
		return count(hql);
	}

	public List<CategorySecond> findAll() {
		String hql = "from CategorySecond";
		return find(hql);
	}

	public List<CategorySecond> findAll(Integer pageNow) {
		String hql = "from CategorySecond";
		return find(hql, pageNow, PAGE_SIZE);
	}

	public List<CategorySecond> findAll(Integer pageNow, Integer pageSize) {
		// TODO Auto-generated method stub
		String hql = "from CategorySecond";
		return find(hql, pageNow, PAGE_SIZE);
	}

	public CategorySecond find(Integer CategorySecondID) {
		// TODO Auto-generated method stub
		String hql = "from CategorySecond cs where cs.csid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, CategorySecondID);
		return (CategorySecond) query.uniqueResult();
	}

}
