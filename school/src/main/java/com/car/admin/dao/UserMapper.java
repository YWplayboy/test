package com.car.admin.dao;

import com.car.admin.empty.User;
import com.car.exception.DBException;
import com.car.static_comment.BaseComment;

public interface UserMapper extends BaseComment<User> {
	public User login(String loginId) throws DBException;
}
