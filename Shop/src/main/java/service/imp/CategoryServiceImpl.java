package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CategoryDao;
import model.Category;
import service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;

	@Transactional(readOnly = true)
	public List<Category> getCategory() {
		return categoryDao.findAll();
	}

}
