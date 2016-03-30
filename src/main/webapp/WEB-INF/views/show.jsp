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
	<script src="<%=path%>/scripts/check.js"></script>
	<style>
		body {
			  margin: 70px 50px;
		}
	</style>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<table class="table table-bordered">
		<tr>
			<th>密码</th>
			<th>url</th>
			<th>类型</th>
			<th>备注</th>
		</tr>
		<c:forEach items="${passwords}" var="password">
			<tr>
				<td>${password.password}</td>
				<td>${password.url}</td>
				<td>${password.type}</td>
				<td>${password.remark}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>