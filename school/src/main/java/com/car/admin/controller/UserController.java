package com.car.admin.controller;

import com.car.admin.empty.User;
import com.car.admin.services.UserService;
import com.car.exception.DBException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private UserService service;

	@ResponseBody
	@RequestMapping(value = { "/login.do" }, method = { RequestMethod.POST })
	public Object findAll(HttpServletRequest request){
		List<User> list = new ArrayList<>();
		try {
			list = service.findAll();
		} catch (DBException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return list;
	}
}
