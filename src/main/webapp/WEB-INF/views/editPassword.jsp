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
	<script src="<%=path%>/scripts/editPassword.js"></script>
	<style>
		body {
			margin: 70px 50px;
		}
	</style>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
		<div class="panel panel-info text-center">
	
		<div class="panel-heading">
			<h3 class="panel-title">编辑密码</h3>
		</div>
	
		<div class="panel-body">
			<form:form modelAttribute="password" method="POST" action="${ pageContext.servletContext.contextPath }/user/password" id="edit-form" class="form-horizontal" role="form">
				<input type="hidden" name="_method" value="PUT"/>
				<form:hidden path="id"/>
				<div class="form-group">
		 			<label for="name" class="col-md-2 control-label">名称</label>
		 			<div class="col-md-10">
						<form:input path="name" cssClass="form-control"/>
		 			</div>
				</div>
				<div class="form-group">
		 			<label for="password" class="col-md-2 control-label">密码</label>
		 			<div class="col-md-8">
		 				<input type="password" value="${password.password}" class="form-control" id="password-input"/>
		 			</div>
		 			<div class="col-md-2">
		 				<a href="#" class="btn btn-info showPassword-a" role="button">点击显示</a>
		 			</div>
				</div>
				<div class="form-group">
		 			<label for="remark" class="col-md-2 control-label">备注</label>
		 			<div class="col-md-10">
						<form:input path="remark" cssClass="form-control"/>
		 			</div>
				</div>
				<input type="submit" class="btn btn-primary" id="edit-button" value="提交"/>
			</form:form>
		</div>
	</div>		
</body>
</html>