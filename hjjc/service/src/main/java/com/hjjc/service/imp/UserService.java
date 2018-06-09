package com.hjjc.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.UsersMapper;
import com.hjjc.model.Users;
import com.hjjc.model.UsersCriteria;
import com.hjjc.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UsersMapper usersMappper;
	
	@Override
	public void test() {
		System.out.println("hello world");
	}

	@Override
	public List<Users> findUser(String username) {
		UsersCriteria usersCriteria = new UsersCriteria();
		usersCriteria.createCriteria().andUserNameEqualTo(username);
		return usersMappper.selectByExample(usersCriteria);
	}
	
	

}
