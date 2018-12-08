package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.controller.AbstractController;
import com.example.dubbo.service.GreetingService;

@Controller
public class DubboController extends AbstractController {
	private ClassPathXmlApplicationContext context;

	// 入力检查
	@Override
	public void check(HttpServletRequest request, HttpServletResponse response) {
	}

	//
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
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

	@RequestMapping(value = "/startProvice")
	public void startProvice() {
		context = new ClassPathXmlApplicationContext(new String[] {"config/dubbo/provider.xml"});
		context.start();          
	}
	
	@RequestMapping(value = "/startConsumer")
	public void startConsumer() {
		context = new ClassPathXmlApplicationContext(new String[] {"config/dubbo/consumer.xml"});
        context.start();
        GreetingService demoService = (GreetingService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
	}

	

}



