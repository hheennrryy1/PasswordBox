$(document).ready(function () {
	$("#edit-button").click(function () {
		var args = $("#edit-form").serialize(); 
		var url = "/PasswordBox/user/edit";
		$.post(url, args, function(data, status) {
			if(data==="success") {
				alert("修改成功!");
				window.location.href = "/PasswordBox/user/home";
			}
			if(data==="fail") {
				alert("用户名已被使用!");
			}
		});
	});
});

/*		$.ajax({ 
			url : "/PasswordBox/user/edit", 
			type : "post", 
			dataType : "text", 
			data: param, 
			success : function(result) {
				alert("dfsd");
				if(data==="success") {
					alert("修改成功!");
					window.location.href = "/PasswordBox/user/home";
				}
				if(data==="fail") {
					alert("用户名已被使用!");
				}
			} 
		}); 
		
	});*/
	
