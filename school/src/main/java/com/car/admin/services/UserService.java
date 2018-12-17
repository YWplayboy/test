package com.car.admin.services;

import com.car.admin.empty.User;
import com.car.exception.DBException;
import com.car.static_comment.BaseComment;

public interface UserService extends BaseComment<User>{
	public User login(String loginId) throws DBException;
}
