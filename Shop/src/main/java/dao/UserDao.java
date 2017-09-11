package dao;

import java.util.List;

import model.User;

public interface UserDao extends BaseDao<User>{
	
	User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);
	
	User findByCode(String code);
	
	Integer countUser();
	
	List<User> findAll(Integer page);
	
	User find(Integer userID);

}
