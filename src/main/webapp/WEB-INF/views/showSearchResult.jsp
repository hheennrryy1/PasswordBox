<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
	<title>PasswordBox</title>
	<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css"/>
	<script src="<%=path%>/scripts/jquery.min.js"></script>
	<script src="<%=path%>/scripts/bootstrap.min.js"></script>
	<script src="<%=path%>/scripts/show.js"></script>	
	<style>
		body {
			    margin: 70px 50px;
		}
	</style>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	
		<form action="" method="POST">
			<input type="hidden" name="_method" value="DELETE"/>
		</form>
		
		<table class="table table-bordered table-hover">
		<tr class="info">
			<th>名称</th>
			<th>密码</th>
			<th>url</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${passwords}" var="password">
			<tr>
				<td>${password.name}</td>
				<td>
					<input type="password" value="${password.password}" class="password-input" readonly="readonly"/>
					<a href="#" class="btn btn-info showPassword-a" role="button">点击显示</a>
				</td>
				<td>${password.url}</td>
				<td>${password.remark}</td>
				<td>
					<a href="<%=path%>/user/password/${ password.id }" class="btn btn-success" role="button">编辑</a>
					<a href="<%=path%>/user/password/${ password.id }" class="btn btn-danger delete" role="button">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>