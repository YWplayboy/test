package com.car.admin.empty;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String loginId;
	private String password;
	private String name;
	private String createTime;
	private Integer isAdmin = 0;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", loginId='" + loginId + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
