package service;

import java.util.List;

import model.Admin;
import model.User;

public interface AdminService {
	
	void updateUser(User user);
	Admin checkUser(Admin admin);
	void deleteUser(Integer userID);
	List<User> findAll(Integer page);
	Integer countUser();
	User findUserByID(Integer userID);
	Admin findAdminByID(Integer adminID);

}
