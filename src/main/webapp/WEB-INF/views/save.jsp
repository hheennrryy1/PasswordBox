<%@ page language="java" contentType="text/html; charset=UTF-8"
                pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
	<title>PasswordBox</title>
	<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="/PasswordBox/css/font-awesome.min.css"/>
	<script src="<%=path%>/scripts/jquery.min.js"></script>
	<script src="<%=path%>/scripts/bootstrap.min.js"></script>
	<script src="<%=path%>/scripts/save.js"></script>
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
			<h3 class="panel-title">添加密码</h3>
		</div>
	
		<div class="panel-body">
			<form class="form-horizontal" role="form" action="#" method="POST">
			     <div class="form-group" id="passwordType-div">
				     	<input type="radio" name="passwordType" value="1" checked="checked"/>密码
				     	<input type="radio" name="passwordType" value="2"/>登录
				     	<input type="radio" name="passwordType" value="3"/>银行帐号
				 <!--     	<input type="radio" name="passwordType" value="4"/>类别
				     	<input type="radio" name="passwordType" value="5"/>类别 -->
			     </div>
			     <div class="form-group">
			            <label for="name" class="col-md-2 control-label">名称</label>
			            <div class="col-md-10">
			                 <input type="text" class="form-control" id="name"
			                	  name="name" placeholder="请输入名称">
			            </div>
			     </div>
			     <div class="form-group">
			            <label for="password" class="col-md-2 control-label">密码</label>
			            <div class="col-md-10">
			                 <input type="password" class="form-control" id="password"
									name="password" placeholder="请输入密码">
			            </div>
			     </div>
			     <div class="form-group" id="url-div" style="display: none;">
					<label for="url" class="col-md-2 control-label">网站</label>
			            <div class="col-md-10">
			                 <input type="text" class="form-control" id="url"
			                  			name="url" placeholder="url">
			            </div>								     	
			     </div>
			     <div class="form-group">
					<label for="remark" class="col-md-2 control-label">备注</label>
			            <div class="col-md-10">
			                 <input type="text" class="form-control" id="remark" 
			                 			name="remark" placeholder="备注">
			            </div>								     	
			     </div>
			     
			     <div class="form-group">
			            <div class="col-md-offset-2 col-md-10">
			                 <input type="submit" class="btn btn-default" value="保存"></input>
			            </div>
			     </div>
			</form>
		</div>
	
	</div>
</body>
</html>