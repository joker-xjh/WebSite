package service;

import java.util.List;

import model.CategorySecond;

public interface AdminCategorySecondService {
	
	Integer countCategorySecond();
	
	CategorySecond find(Integer CategorySecondID);
	
	void saveOrUpdate(CategorySecond categorySecond);
	
	void delete(CategorySecond categorySecond);
	
	void delete(Integer CategorySecondID);
	
	List<CategorySecond> findAll(Integer page, Integer row);

}
