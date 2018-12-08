package com.example.dubbo.service.impl;

import com.example.dubbo.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {
	
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
