package com.car.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

	@RequestMapping(value = {"","/"}, method = {RequestMethod.GET})
	public Object admin(ModelMap model, HttpServletRequest request){
		return "redirect:/admin";
	}
	/**
	 * 首页
	 */
	@RequestMapping(value = {"/index.html"}, method = {RequestMethod.GET})
	public String index(ModelMap model, HttpServletRequest request){
		System.out.println(Thread.currentThread().getName());
		return "admin/index";
	}
	/**
	 * 登陆
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = {"/admin/login.html"}, method = { RequestMethod.GET })
	public String login(ModelMap model, HttpServletRequest request){
		return "admin/login";
	}
}
