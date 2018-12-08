package com.OTA.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.controller.AbstractController;

import ota.jw.ws.OrderService;
import ota.jw.ws.QueryServer;
import pms.service.PmsInfoService;

@Controller
@RequestMapping("/OTAServer")
public class StartOtaWxController extends AbstractController {
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
		return "index";
	}

	@RequestMapping(value = "/startOtaServer")
	public void startOtaServer() {
		PmsInfoService.startOtaServer();
		OrderService.startOtaServer();  
		QueryServer.startOtaServer();
	}
}
