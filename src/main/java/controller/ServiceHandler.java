package controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;
import entity.User;

@Service("service")
public class ServiceHandler {
	@Resource(name="userDAO")
	private UserDAO dao;
	public User login(String uname,String pwd) {
		User user = dao.findById(uname);
		if(user!=null&&pwd.equals(user.getPwd())) {
			return user;
		}
		return null;
	}
	
}
