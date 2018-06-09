package com.hjjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.hjjc.model.Users;
import com.hjjc.service.IUserService;

import net.sf.json.JSONObject;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(String username,String password) {
		JSONObject obj = new JSONObject();
		if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
			obj.put("result", 1);
			obj.put("desc", "用户名密码不能为空");
			return obj.toString();
		}
		List<Users> userLs = userService.findUser(username);
		if(userLs == null || userLs.size() == 0){
			obj.put("result", 1);
			obj.put("desc", "用户名不存在");
			return obj.toString();
		}
		Users user = userLs.get(0);
		if(user.getUserPwd().equals(password)){
			obj.put("result", 0);
			obj.put("desc", "登录成功");
			obj.put("structCode", "0030");
			return obj.toString();
		}
		else{
			obj.put("result", "1");
			obj.put("desc", "密码错误");
			return obj.toString();
		}
	}
	
	@RequestMapping("/modifyPassword")
	@ResponseBody
	public String modifyPassword(String userName,String oldPassword,String newPassword){
		System.out.println("modify password:userName="+userName+",oldPassword="+oldPassword+",newPassword="+newPassword);
		JSONObject obj = new JSONObject();
		obj.put("result", 0);
		obj.put("desc", "修改成功");
		return obj.toString();
	}
}
