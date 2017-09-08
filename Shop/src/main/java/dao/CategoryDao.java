package dao;

import java.util.Date;
import java.util.List;

import model.Category;

public interface CategoryDao extends BaseDao<Category>{
	
	Integer countCategory();
	
	List<Category> findAll();
	List<Category> findAll(Integer pageNow);
	List<Category> findAll(Integer pageNow, Integer pageSize);
	Category find(Integer categoryID);
	
	public Date queryPrivilegeTime(Integer categoryID);
	

}
