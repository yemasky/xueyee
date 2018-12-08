package com.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.UsercenterApi;
import com.base.controller.AbstractController;

@Controller
public class UserLoginController extends AbstractController {

	@Override
	public void check(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterCheck(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String defaultAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	@ResponseBody
	public boolean login(String loginname, String userPassword) {
		boolean isLogin = false;
		try {
			isLogin = UsercenterApi.login(loginname, userPassword);
		} catch (SQLException e) {
			logger.error("error:", e);
			e.printStackTrace();
		}
		return isLogin;
	}
	
	@RequestMapping(value = "/logged", method=RequestMethod.GET)
	@ResponseBody
	public String checkLogin(HttpServletRequest request) {
		return "success";
	}

	
}
