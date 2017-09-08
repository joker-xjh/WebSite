package dao;

import java.util.List;

import model.CategorySecond;

public interface CategorySecondDao extends BaseDao<CategorySecond>{
	
	Integer countCategorySecond();
	
	List<CategorySecond> findAll();
	List<CategorySecond> findAll(Integer pageNow);
	List<CategorySecond> findAll(Integer pageNow, Integer pageSize);
	CategorySecond find(Integer CategorySecondID);

}
