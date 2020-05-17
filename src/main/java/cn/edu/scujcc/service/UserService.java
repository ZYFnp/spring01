package cn.edu.scujcc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scujcc.api.UserController;
import cn.edu.scujcc.dao.UserRepository;
import cn.edu.scujcc.model.User;

public @Service class UserService {
	@Autowired
	private UserRepository repo;
	private final static Logger Logger = LoggerFactory.getLogger(UserService.class);

	public User register(User user) {
		User result = null;
		User saved = repo.findFirstByUsername(user.getUsername());
		if(saved == null) {
			result = repo.save(user);
		}else {
			Logger.error("用户"+user.getUsername()+"已存在。");
		}
		
		return result;
	}
}
