package com.atguigu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.service.AttrServiceInf;
import com.atguigu.service.ListServiceInf;

@Controller
public class IndexController {

	@Autowired
	AttrServiceInf attrServiceInf;
	@Autowired
	ListServiceInf listServiceInf;
	
	@RequestMapping("index")
	public String index(HttpServletRequest request,ModelMap map) {

		/*
		 * String yh_mch = ""; Cookie[] cookies = request.getCookies(); if
		 * (cookies != null && cookies.length > 0) { for (int i = 0; i <
		 * cookies.length; i++) { String name = cookies[i].getName(); if
		 * (name.equals("yh_mch")) { yh_mch = cookies[i].getValue(); } } }
		 * map.put("yh_mch", yh_mch);
		 */
		return "index";
	}
	@RequestMapping("goto_login_checkOrder")
	public String goto_login_checkOrder(HttpServletRequest request, ModelMap map) {
		return "loginOrder";
	}
	@RequestMapping("goto_login")
	public String goto_login(HttpServletRequest request, ModelMap map) {
		return "login";
	}
	@RequestMapping("goto_logout")
	public String goto_logout(HttpServletRequest request, ModelMap map) {
		return "redirect:/goto_login.do";
	}
	@RequestMapping("orderErr")
	public String orderErr(HttpServletRequest request, ModelMap map) {
		return "orderErr";
	}

	
}
