package dao;

import model.Admin;

public interface AdminDao extends BaseDao<Admin>{
	
	Admin findByAdminUsernameAndPassword(String username, String password);
	Admin find(Integer adminID);
}
