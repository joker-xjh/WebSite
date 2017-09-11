package service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CategorySecondDao;
import model.CategorySecond;
import service.AdminCategorySecondService;

@Transactional
@Service("adminCategorySecondService")
public class AdminCategorySecondServiceImpl implements AdminCategorySecondService{
	
	@Autowired
	@Qualifier(value = "categorySecondDao")
	private CategorySecondDao categorySecondDao;

	@Transactional(readOnly = true)
	public Integer countCategorySecond() {
		return categorySecondDao.countCategorySecond();
	}

	@Transactional(readOnly = true)
	public CategorySecond find(Integer CategorySecondID) {
		return categorySecondDao.find(CategorySecondID);
	}

	public void saveOrUpdate(CategorySecond categorySecond) {
		categorySecondDao.saveOrUpdate(categorySecond);
	}

	public void delete(CategorySecond categorySecond) {
		categorySecondDao.delete(categorySecond);
	}

	public void delete(Integer CategorySecondID) {
		categorySecondDao.delete(CategorySecondID);
	}

	@Transactional(readOnly = true)
	public List<CategorySecond> findAll(Integer page, Integer row) {
		return categorySecondDao.findAll(page, row);
	}
	
	

}
