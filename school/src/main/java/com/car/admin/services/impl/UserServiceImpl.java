package com.car.admin.services.impl;

import com.car.admin.dao.UserMapper;
import com.car.admin.empty.User;
import com.car.admin.services.UserService;
import com.car.exception.DBException;
import com.car.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper mapper;

	@Override
	public User findById(String id) throws DBException {
		if ( StringUtil.isBlank(id) ) return null;
		return mapper.findById(id);
	}

	@Override
	public int add(User obj) throws DBException {
		if(StringUtils.isEmpty(obj)) return 0;
		return mapper.add(obj);
	}

	@Override
	public int update(User obj) throws DBException {
		if(StringUtils.isEmpty(obj)) return 0;
		return mapper.update(obj);
	}

	@Override
	public int delete(String id) throws DBException {
		if ( StringUtil.isBlank(id) ) return 0;
		return mapper.delete(id);
	}

	@Override
	public List<User> findAll() throws DBException {
		return mapper.findAll();
	}

	@Override
	public User login(String loginId) throws DBException {
		if(StringUtil.isBlank(loginId)) return new User();
		return mapper.login(loginId);
	}
}
