<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="inc/defines.jsp"%>
<html>
	<head>
		<title>登陆</title>
		<%@include file="inc/base_style.jsp"%>
		<link rel="stylesheet" href="${ctx}/css/animate.css">
		<link rel="stylesheet" href="${ctx}/css/style.css">
	</head>
	<body>
	<%@include file="inc/header.jsp"%>
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<ul class="menu">
						<li class="active"><a href="login.jsp">Style 1</a></li>
					</ul>
				</div>
			</div>
            <div class="copyrights">Collect from <a href="http://www.moobnn.com/"  title="网站模板">网站模板</a></div>
			<div class="row">
				<div class="col-md-4 col-md-offset-4">


					<!-- Start Sign In Form -->
					<form action="#" class="fh5co-form animate-box" data-animate-effect="fadeIn">
						<h2>Sign In</h2>
						<div class="form-group">
							<label for="username" class="sr-only">用户名</label>
							<input type="text" class="form-control" id="username" placeholder="用户名" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">密码</label>
							<input type="password" class="form-control" id="password" placeholder="密码" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="remember"><input type="checkbox" id="remember">记住密码</label>
						</div>
						<div class="form-group">
							<p>Not registered? <a href="sign-up.html">登陆</a> | <a href="forgot.html">忘记密码?</a></p>
						</div>
						<div class="form-group">
							<input type="submit" value="Sign In" class="btn btn-primary">
						</div>
					</form>
					<!-- END Sign In Form -->

				</div>
			</div>
		</div>
<%@include file="inc/base_script.jsp"%>
	</body>
</html>

