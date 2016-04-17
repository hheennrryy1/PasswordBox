<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>PasswordBox</title>
	<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css"/>
	<script src="<%=path%>/scripts/jquery.min.js"></script>
	<script src="<%=path%>/scripts/bootstrap.min.js"></script>
	<style>
		body {
			  margin: 70px 30px;
		}
		.introduces {
			background-color: #eee;
			margin-left: 20px;
			margin-bottom: 30px;
		}
	</style>
</head>
<body>
  	<jsp:include page="nav.jsp"></jsp:include>
  	
		<div class="jumbotron text-center" id="ad">
			<h1>欢迎使用PasswordBox</h1>
			<p>PasswordBox是一个独特的密码管理器,可以为您带来安全和方便。</p>
		</div>
	
	<div class="container text-center">
		
		<div class="row">
			<div class="col-xs-12 col-md-4 introduces">
				<h3>PasswordBOX是完全开源的。它的代码托管、开发、维护都依赖 GitHub 平台。</h3>
			</div>
			
			<div class="col-xs-12 col-md-7 col-md-offset-1 introduces">
				<h2>${ sessionScope.user.userName }, 你好!</h2>
				<h2>你是第${ sessionScope.user.id }个使用PasswordBox的用户</h2>
			</div>
			
		</div>
		
		<div class="row">
			<div class="col-xs-12 col-md-7 introduces">
				<h3>PasswordBox支持大多数Web浏览器，包括Safari, Chrome, Camino, OmniWeb, DEVONagent, Firefox, Flock, Fluid, 和NetNewsWire等主流浏览器。</h3>
			</div>
			
			<div class="col-xs-12 col-md-4 col-md-offset-1 introduces">
				<h3>所有浏览器扩展都共享一个密码链上的存储数据，这意味着当你从一个浏览器跳到另外一个浏览器的时候再也不需要手动复制您的密码。</h3>
			</div>				
		</div>
		
		<div>
			<img src="<%=path%>/images/sakamoto.jpg" style="magin: 0 auto;" alt="坂本"/>
		</div>		
	</div>
	
</body>
</html>