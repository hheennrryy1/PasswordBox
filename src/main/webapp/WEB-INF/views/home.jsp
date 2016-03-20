<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>PasswordBox</title>
	<link href="/PasswordBox/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="/PasswordBox/css/font-awesome.min.css"/>
	<script src="/PasswordBox/scripts/jquery.min.js"></script>
	<script src="/PasswordBox/scripts/bootstrap.min.js"></script>
	<script src="/PasswordBox/scripts/home.js"></script>
</head>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	    <div class="navbar-header">
	        <a class="navbar-brand" href="home.html"><i class="fa fa-home fa-fw"></i>PasswordBox</a>
      			<span class="navbar-text">Welcome back,${sessionScope.user.userName}</span>
	    </div>
	    <div>
	        <ul class="nav navbar-nav">
	            <li><a href="save.html"><i class="fa fa-key fa-fw"></i>添加密码</a></li>
	            <li><a href="check.html"><i class="fa fa-list-ol fa-fw"></i>所有项目</a></li>
	            <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
	                	<i class="fa fa-user fa-fw"></i>
	                   	帐号 <b class="caret"></b>
	                </a>
	                <ul class="dropdown-menu">
	                    <li><a href="#"><i class="fa fa-sign-out"></i>登出</a></li>
	                    <li><a href="#"><i class="fa fa-edit"></i>修改信息</a></li>
	                </ul>
	            </li>
	        </ul>
	    </div>
	    
		<div>
			<form class="navbar-form navbar-left" role="search">
				<div class="input-group">
					<div class="input-group-addon"><i class="fa fa-search-plus"></i></div>
					<input type="text" class="form-control" placeholder="搜索名称,url">
				</div>
				<button type="submit" class="btn btn-default">提交</button>
      		</form>
		</div>
	</nav>
</body>
</html>