package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CategoryDao;
import model.Category;
import service.AdminCategoryService;

@Transactional
@Service("adminCategoryService")
public class AdminCategoryServiceImpl implements AdminCategoryService{
	
	@Autowired
	@Qualifier(value = "categoryDao")
	private CategoryDao categoryDao;

	public void saveOrUpdate(Category category) {
		categoryDao.saveOrUpdate(category);
	}

	public void delete(Category category) {
		categoryDao.delete(category);
	}

	@Transactional(readOnly = true)
	public Category find(Integer categoryID) {
		return categoryDao.find(categoryID);
	}

	@Transactional(readOnly = true)
	public List<Category> findAll(Integer page, Integer row) {
		return categoryDao.findAll(page, row);
	}

	@Transactional(readOnly = true)
	public Integer countCategory() {
		return categoryDao.countCategory();
	}

}
