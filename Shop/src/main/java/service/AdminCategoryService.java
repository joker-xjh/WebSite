package service;

import java.util.List;

import model.Category;

public interface AdminCategoryService {
	
	void saveOrUpdate(Category category);
	
	void delete(Category category);
	
	Category find(Integer categoryID);
	
	List<Category> findAll(Integer page, Integer row);
	
	Integer countCategory();

}
