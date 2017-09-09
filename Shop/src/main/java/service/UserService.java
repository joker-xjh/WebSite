package service;

import model.User;

public interface UserService {
	
	User active(String code);
	
	User findByUsernameAndPassword(User user);
	
	User existUser(User user);
	
	void register(User user);
	
	void update(User user);
	
	User findByID(Integer userID);

}
