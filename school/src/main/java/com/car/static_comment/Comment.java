package com.car.static_comment;

public class Comment {
	private Comment(){}

	/** 后台用户登录保存的session key */
	public static final String USER_SESSION_KEY = "user";

	/** 门户用户登录保存的session key */
	//public static final String MEMBER_SESSION_KEY = "member";

	/** 登录后的转向地址session key */
	public static final String URL_FORWARD = "forward";

	/** 前台访问的单位ID */
	//public static final String VISIT_ORG_ID = "visitOrgId";

	/** 树跟节点的父ID */
	public static final int TREE_ROOT_ID = -1;

	/**
	 * 行政区Node根ID
	 */
	//public static final int ZONE_ID_CN = 100000;
	//public static final String ZONE_NAME_CN = "中国";

	/** 初始化用户密码 */
	public static final String INIT_PASSWORD = "888888";

	/** 超级管理员ID  */
	public static final long ADMIN_USER_ID = 1;
	/** 超级管理员账号  */
	public static final String ADMIN_USER_LOGIN_ID = "admin";
	/** 超级管理员密码 */
	public static final String ADMIN_USER_PASSWORD = INIT_PASSWORD;
	/** 超级管理员姓名 */
	public static final String ADMIN_USER_NAME = "超级管理员";
}
