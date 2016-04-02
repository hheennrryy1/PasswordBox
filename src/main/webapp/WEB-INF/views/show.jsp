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
	<table class="table table-bordered">
	<caption>点击密码显示/隐藏明文</caption>
		<tr class="success">
			<th>密码</th>
			<th>url</th>
			<th>类型</th>
			<th>备注</th>
		</tr>
		<c:forEach items="${passwords}" var="password">
			<tr class="info">
				<td>
					<input type="password" value="${password.password}" class="password-input" readonly="readonly"/>
				</td>
				<td>${password.url}</td>
				<td>${password.type}</td>
				<td>${password.remark}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>