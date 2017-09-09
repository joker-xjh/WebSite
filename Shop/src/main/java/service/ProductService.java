package service;

import java.util.List;

import model.Product;

public interface ProductService {
	
	// 根据二级分类查询商品
	List<Product> findByCsID(Integer categorySecondID, Integer page);
	
	// 根据一级分类查询商品
	List<Product> findByCID(Integer categoryID, Integer page);
	
	// 查找最热的商品10条
	List<Product> findHot();
	
	// 查找最新的商品10条
	List<Product> findNew();
	
	//根据商品的ID的值查询商品
	Product findByID(Integer productID);
	
	//返回一级分类商品的数量
	Integer countProductFromCategory(Integer categoryID);
	
	//返回二级分类商品的数量
	Integer countProductFromCategorySecond(Integer categorySecondID);
	
	//保存商品
	void save(Product product);
	
	//更新商品
	void update(Product product);
	

}
