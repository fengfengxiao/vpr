package com.hjjc.service;

import java.util.List;

import com.hjjc.model.Users;

public interface IUserService {
	public void test();
	public List<Users> findUser(String username);
}
