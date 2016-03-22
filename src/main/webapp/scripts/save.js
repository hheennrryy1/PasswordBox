$(document).ready(function() {
	$("#passwordType-div").change(function() {
		var i = $('input[name="passwordType"]:checked').val();
		if(i==2) {
			$("input").append("<input></input>");
			$("#url-div").fadeIn();
		}
		else {
			$("#url-div").fadeOut();
		}
	});
})