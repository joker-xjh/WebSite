package dao;

import java.util.List;

import model.CategorySecond;
import model.Product;

public interface ProductDao extends BaseDao<Product>{
	
	List<Product> findHot();
	List<Product> findHot(Integer limit);
	
	List<Product> findNew(Integer limit);
	
	List<Product> findByCategorySecondID(Integer csID, Integer page);
	Integer countCategorySecondProduct(Integer csID);
	
	List<Product> findByCategoryID(Integer categoryID, Integer page);
	Integer countCategoryProduct(Integer categoryID);
	
	Integer countProduct();
	List<Product> findAll(Integer page);
	
	Product findOne(Integer productID);
	
	CategorySecond findCategorySecond(Integer categorySecondID);
	
	
	

}
