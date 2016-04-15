$(function() {
	$(".showPassword-a").click(function() {
		var attr = $("#password-input").attr("type");
		if(attr=="password") {
			$("#password-input").attr("type", "text");
		}
		if(attr=="text") {
			$("#password-input").attr("type", "password");
		}
	});
})
