package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AdminDao;
import dao.UserDao;
import model.Admin;
import model.User;
import service.AdminService;

@Transactional
@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private UserDao userDao;

	public void updateUser(User user) {
		userDao.update(user);
	}

	public Admin checkUser(Admin admin) {
		return adminDao.findByAdminUsernameAndPassword(admin.getUsername(), admin.getPassword());
	}

	public void deleteUser(Integer userID) {
		userDao.delete(userID);
	}

	@Transactional(readOnly = true)
	public List<User> findAll(Integer page) {
		return userDao.findAll(page);
	}

	@Transactional(readOnly = true)
	public Integer countUser() {
		return userDao.countUser();
	}

	@Transactional(readOnly = true)
	public User findUserByID(Integer userID) {
		return userDao.find(userID);
	}

	@Transactional(readOnly = true)
	public Admin findAdminByID(Integer adminID) {
		return adminDao.find(adminID);
	}

}
