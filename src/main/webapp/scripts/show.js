$(document).ready(function() {
	
	$(".showPassword-a").click(function() {
		var attr = $(this).prev().attr("type");
		if(attr=="password") {
			$(this).prev().attr("type", "text");
		}
		if(attr=="text") {
			$(this).prev().attr("type", "password");
		}
	});
	
	$(".delete").click(function() {
		var flag = confirm("确定删除?");
		if(flag==true) {
			var href = $(this).attr("href");
			$("form").attr("action", href).submit();			
		}
		return false;
	});
	
})