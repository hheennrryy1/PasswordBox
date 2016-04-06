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
})