$(document).ready(function() {
	$(".password-input").click(function() {
		var attr = $(this).attr("type");
		if(attr=="password") {
			$(this).attr("type", "text");
		}
		
		if(attr=="text") {
			$(this).attr("type", "password");
		}
	});
})