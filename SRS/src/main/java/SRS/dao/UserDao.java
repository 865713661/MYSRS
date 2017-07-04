package SRS.dao;

import java.util.List;

import SRS.model.User;


public interface UserDao extends BaseDao{
	
	public List<User> findAllUser();
	
	
	
}
