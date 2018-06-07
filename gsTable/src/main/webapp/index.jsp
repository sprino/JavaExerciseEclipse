<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
		<title>Maven + Spring MVC</title>
</head>
	
<body>

	<h1>Prova</h1>
		<div>
			<button id="micro">PUSH</button>
		</div>

	<div id="nuovo" ></div>

		<script
		  src="https://code.jquery.com/jquery-3.3.1.min.js"
		  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		  crossorigin="anonymous">
		</script>
		<script type="text/javascript">
//		jQuery(document).ready(function($){
//			$("#micro").click(function(event){
//				$.ajax({
//					url:"/gs/micro2"
//				}).then(function(data) {
//					$("#nuovo").append(data);
//					console.log(data);
//				});
//			});
//		});
		
		
		$(document).ready(function($){
			$('#micro').click(function(event){
			$.ajax({ 
			    type: 'GET', 
			    url: '/gs/utenti', 
			    data: { get_param: 'value' }, 
			    dataType: 'json',
			    success: function (data) { 
			        $('<div>').remove();
			        $.each(data, function(index, element) {
			            $('body').append($('<div>', {
			                text: element.id + " " + element.name + " " + element.country
			            }));
			        });
			    }
			});
			});
			});
		

		
		//A $( document ).ready() block.
		//$( document ).ready(function() {
		//    alert( "Bocciato!" );
		//});
		
		</script>

</body>

</html>