package service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.User;
import service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = true)
	public User active(String code) {
		return userDao.findByCode(code);
	}

	@Transactional(readOnly = true)
	public User findByUsernameAndPassword(User user) {
		return userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	@Transactional(readOnly = true)
	public User existUser(User user) {
		return userDao.findByUsername(user.getUsername());
	}

	public void register(User user) {
		user.setState(1);
		userDao.save(user);
	}

	public void update(User user) {
		userDao.update(user);
	}

	@Transactional(readOnly = true)
	public User findByID(Integer userID) {
		return userDao.find(userID);
	}

}
