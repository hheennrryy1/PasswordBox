	<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>  
	<%String path = request.getContextPath();%>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	    <div class="navbar-header">
	        <a class="navbar-brand" href="<%=path %>/user/home"><i class="fa fa-home fa-fw"></i>PasswordBox</a>
	    </div>
	    <div>
	        <ul class="nav navbar-nav">
	            <li><a href="<%=path %>/user/password"><i class="fa fa-key fa-fw"></i>添加密码</a></li>
	            <li><a href="<%=path %>/user/password/list/0"><i class="fa fa-list-ol fa-fw"></i>所有密码</a></li>
	            <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
	                	<i class="fa fa-user fa-fw"></i>
	                   	${sessionScope.user.userName}的帐号 <b class="caret"></b>
	                </a>
	                <ul class="dropdown-menu">
	                    <li><a href="<%=path%>/user/signOut"><i class="fa fa-sign-out"></i>登出</a></li>
	                    <li><a href="<%=path%>/user/input?id=${sessionScope.user.id}"><i class="fa fa-edit"></i>修改信息</a></li>
	                </ul>
	            </li>
	        </ul>
	    </div>
	    
		<div>
			<form class="navbar-form navbar-left" role="search" action="<%=path%>/user/password/${sessionScope.user.id}" method="POST">
				<div class="input-group">
					<div class="input-group-addon"><i class="fa fa-search-plus"></i></div>
					<input type="text" class="form-control" name="keyword" placeholder="搜索名称、备注" id="search-input"/>
				</div>
				<input type="submit" class="btn btn-default" name="#" value="搜索"></input>
	     	</form>
		</div> 
		
		<p class="navbar-text navbar-left">Copyright &copy; 2016,  <a href="https://github.com/hheennrryy1">Henry</a></p>
	</nav>