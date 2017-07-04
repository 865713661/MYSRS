package SRS.service;

import java.util.List;

import SRS.dao.DaoFactory;
import SRS.dao.UserDao;
import SRS.model.User;


public class UserService {

	private UserDao dao = DaoFactory.createUserDao();
	public boolean getUser(User user) {
		List<User> users = dao.findAllUser();
		for(User u:users){
			if(u.validatePassword(user.getPassword(),user.getType())){
				return true;
			}
		}
		return false;
		
	}
}
