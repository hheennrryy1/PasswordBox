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
	<script src="<%=path%>/scripts/home.js"></script>
	<style>
		body {
			  margin: 70px 30px;
		}
	</style>
</head>
<body>
  	<jsp:include page="nav.jsp"></jsp:include>
		<div class="jumbotron text-center" id="ad">
			<h1>欢迎使用PasswordBox</h1>
			<p>PasswordBox是一个独特的密码管理器,可以为您带来安全和方便。</p>
		</div>
</body>
</html>