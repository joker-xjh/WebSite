package dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dao.ProductDao;
import model.CategorySecond;
import model.Product;

@Repository("productDao")
@SuppressWarnings("all")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{
	
	private static final int PAGE_SIZE = 12;

	public List<Product> findHot() {
		String hql = "from Product p where p.is_hot = 1 order by p.pDate desc";
		return find(hql, 1, 10);
	}

	public List<Product> findHot(Integer limit) {
		String hql = "from Product p where p.is_hot = 1 order by p.pDate desc";
		return find(hql, 1, limit);
	}

	public List<Product> findNew(Integer limit) {
		String hql = "from Product p order by p.pDate desc";
		return find(hql, 1, 10);
	}

	
	public List<Product> findByCategorySecondID(Integer csID, Integer page) {
		String hql = "from Product p where p.categorySecond.csid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, csID);
		query.setFirstResult( (page-1) * PAGE_SIZE).setMaxResults(PAGE_SIZE);
		return query.list();
	}

	public Integer countCategorySecondProduct(Integer csID) {
		String hql = "select count(*) from Product p where p.categorySecond.csid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, csID);
		return (Integer) query.uniqueResult();
	}

	public List<Product> findByCategoryID(Integer categoryID, Integer page) {
		String hql = "from Product p where p.categorySecond.category.cid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, categoryID);
		query.setFirstResult( (page-1)*PAGE_SIZE );
		return query.list();
	}

	public Integer countCategoryProduct(Integer categoryID) {
		String hql = "select count(*) from Product p where p.categorySecond.category.cid = ? ";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, categoryID);
		return (Integer) query.uniqueResult();
	}

	public Integer countProduct() {
		String hql = "select count(*) from Product";
		return count(hql);
	}

	public List<Product> findAll(Integer page) {
		String hql = "from Product";
		return find(hql, page, PAGE_SIZE);
	}

	public CategorySecond findCategorySecond(Integer categorySecondID) {
		return null;
	}

	public Product findOne(Integer productID) {
		String hql = "from Product p where p.pid = ?";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter(0, productID);
		return (Product) query.uniqueResult();
	}

}
