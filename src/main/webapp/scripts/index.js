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
				$("#signup-li").addClass("active");   
				$("#signin-li").removeClass("active");
				$("#signin").hide();
				$("#signup").show();
		});
		
		$("#signin-a").click(
			function() {
				$("#signin-li").addClass("active");   
				$("#signup-li").removeClass("active");
				$("#signup").hide();
				$("#signin").show();
			});
		
		$("#login-button").click(function() {
			var userName = $("#userName").val();
			var userPassword = $("#userPassword").val();
			var url = "user/logIn";
			var args = {
					userName:userName,
					userPassword:userPassword
				};
			$.post(url, args, function(data, status) {
				alert(data);
			/*	if(data==="success") {
					
				}
				
				if(data==="fail") {
					
				}*/
			});
		});
	});