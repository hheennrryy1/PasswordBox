<%@ page language="java" contentType="text/html; charset=UTF-8"
                pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
	<title>PasswordBox</title>
	<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="/PasswordBox/css/font-awesome.min.css"/>
	<script src="<%=path%>/scripts/jquery.min.js"></script>
	<script src="<%=path%>/scripts/bootstrap.min.js"></script>
	<script src="<%=path%>/scripts/editInfo.js"></script>
	<style>
		body {
			margin: 70px 50px;
		}
	</style>
</head>
	<jsp:include page="nav.jsp"></jsp:include>
		<div class="panel panel-info text-center">
	
		<div class="panel-heading">
			<h3 class="panel-title">修改信息</h3>
		</div>
	
		<div class="panel-body">
			<form:form commandName="user" id="edit-form">
				<form:label path="userName">用户名:</form:label>
				<input type="hidden" name="id" value="${ user.id }"/>
				<form:input path="userName"/>
				<button type="button" class="btn btn-primary" id="edit-button">提交</button>
			</form:form>
		</div>
	</div>	
</body>
</html>