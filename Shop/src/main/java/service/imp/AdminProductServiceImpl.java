package service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ProductDao;
import model.Product;
import service.AdminProductService;

@Transactional
@Service
public class AdminProductServiceImpl implements AdminProductService{

	@Autowired
	private ProductDao productDao;

	@Transactional(readOnly = true)
	public List<Product> findAll(Integer page) {
		return productDao.findAll(page);
	}

	@Transactional(readOnly = true)
	public Integer countProduct() {
		return productDao.countProduct();
	}

	public void save(Product product) {
		productDao.save(product);
	}

	public void update(Product product) {
		productDao.update(product);
	}
}
