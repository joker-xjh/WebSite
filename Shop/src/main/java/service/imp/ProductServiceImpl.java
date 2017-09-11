package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ProductDao;
import model.Product;
import service.ProductService;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Transactional(readOnly = true)
	public List<Product> findByCsID(Integer categorySecondID, Integer page) {
		return productDao.findByCategorySecondID(categorySecondID, page);
	}

	@Transactional(readOnly = true)
	
	public List<Product> findByCID(Integer categoryID, Integer page) {
		return productDao.findByCategoryID(categoryID, page);
	}

	@Transactional(readOnly = true)
	public List<Product> findHot() {
		return productDao.findHot();
	}

	@Transactional(readOnly = true)
	public List<Product> findNew() {
		return productDao.findNew(10);
	}

	@Transactional(readOnly = true)
	public Product findByID(Integer productID) {
		return productDao.findOne(productID);
	}

	@Transactional(readOnly = true)
	public Integer countProductFromCategory(Integer categoryID) {
		return productDao.countCategoryProduct(categoryID);
	}

	@Transactional(readOnly = true)
	public Integer countProductFromCategorySecond(Integer categorySecondID) {
		return productDao.countCategorySecondProduct(categorySecondID);
	}

	
	public void save(Product product) {
		productDao.save(product);
	}

	public void update(Product product) {
		productDao.update(product);
	}

}
