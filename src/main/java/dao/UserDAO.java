package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.User;
@Repository("userDAO")
public interface UserDAO {
	public void save(User user);
	public User findById(String uname);
	public List<User> findAll();
}
