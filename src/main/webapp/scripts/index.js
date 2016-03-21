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
		
		$.validator.setDefaults({
			submitHandler: function() {
				$("#signup-form").submit();
			}
		});
		
		$("#signup-form").validate({
			rules: {
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
			}
		});

	});