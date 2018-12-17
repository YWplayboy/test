package com.car.filter;

import com.car.admin.empty.User;
import com.car.admin.services.UserService;
import com.car.static_comment.Comment;
import com.car.util.StringUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
	private UserService service;
		//private static final List<String> STRINGS = new ArrayList<String>();
	//此处可以定义加载时要过滤的资源类型
	/*static {
		STRINGS.add("jsp");
		STRINGS.add("js");
		STRINGS.add("css");
		STRINGS.add("images");
		STRINGS.add("bmp");
		STRINGS.add("gif");
		STRINGS.add("jpg");
		STRINGS.add("jpeg");
		STRINGS.add("png");
	}*/
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
		service = webApplicationContext.getBean(UserService.class);
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpSession session = request.getSession();
		String contextPath = request.getContextPath();//项目路径名
		String uri = request.getServletPath();	//资源(不带项目名的相对路径)
		System.out.println(Thread.currentThread().getName());
		if("/admin".equals(uri)) {
			response.sendRedirect(contextPath + "/index.html");
			return;
		}
		chain.doFilter(request,response);
	}

	@Override
	public void destroy() {

	}
}
