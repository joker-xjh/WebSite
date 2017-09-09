package service;

import java.util.List;

import model.Product;

public interface AdminProductService {
	
	List<Product> findAll(Integer page);
	
	Integer countProduct();
	
	void save(Product product);
	
	void update(Product product);
	
	

}
