// HOME BACKGROUND SLIDESHOW
    $(document).ready(function() {
    	$("body").backstretch([
  	 		 "images/index-bg1.jpg", 
  	 		 "images/index-bg2.jpg", 
    	                       ], {duration: 3200, fade: 1300});
    });
    
	$(document).ready(function() {
		$("#signup-a").click(
			function() {
				$("#signup-li").addClass("active").siblings().removeClass("active");
				$("#signin").hide();
				$("#signup").show();
		});
		
		$("#signin-a").click(
			function() {
				$("#signin-li").addClass("active").siblings().removeClass("active");  
				$("#signup").hide();
				$("#signin").show();
			});
		
		$("#signin-button").click(function() {
			var userName = $("#signin-userName").val();
			var userPassword = $("#signin-userPassword").val();
			var url = "user/signIn";
			var args = {
					userName:userName,
					userPassword:userPassword
				};
			$.post(url, args, function(data, status) {
				if(data==="success") {
					window.location.href = "user/home";
				}
				
				if(data==="fail") {
					alert("错误");
				}
			});
		});
		
		
		$("#signup-form").validate({ 
			onsubmit:true,// 是否在提交是验证 
			onfocusout:true,// 是否在获取焦点时验证 
			onkeyup :true,// 是否在敲击键盘时验证 

			rules: {
				userName: {
					required: true,
					minlength: 4
				},
				userPassword: {
					required: true,
					minlength: 6
				},
				userPassword1: {
					required: true,
					minlength: 6,
					equalTo: "#userPassword"
				}
			},
			
			messages: {
			},
			
			submitHandler: function(form) {  //通过之后回调 
				var param = $("#signup-form").serialize(); 
				$.ajax({ 
					url : "user/signUp", 
					type : "post", 
					dataType : "text", 
					data: param, 
					success : function(result) { 
						if(result=="success") { 
							alert("注册成功!");
							window.location.href = "index.html";
						} 
						if(result=="fail") { 
							alert("用户名已被使用!")
						} 
					} 
				}); 
			}, 
			         
			invalidHandler: function(form, validator) {  //不通过回调 
				return false; 
			} 
			         
		});
	});