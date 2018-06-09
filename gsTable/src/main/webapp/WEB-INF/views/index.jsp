<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
		<title>Maven + Spring MVC</title>
</head>
	
<body>
	
	<h1>PROVA</h1><br />
	
		<c:out value="${attrib}"/>

		<div>
			<button id="micro1">PUSH</button>
			<button id="micro2">DOM</button>
		</div>
	<div id="nuovo" ></div>
		<script
		  src="https://code.jquery.com/jquery-3.3.1.min.js"
		  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		  crossorigin="anonymous">
		</script>
		
		<script type="text/javascript">
		jQuery(document).ready(function($){
			$("#micro1").click(function(event){
				$.ajax({
					url:"/gs/micro"
				}).then(function(data) {
					$("#nuovo").empty();
					$("#nuovo").append(data);
					console.log(data);
				});
			});
		});
		
		$(document).ready(function($){
			$('#micro2').click(function(event){
			$.ajax({ 
			    type: 'GET', 
			    url: '/gs/utenti', 
			    data: { get_param: 'value' }, 
			    dataType: 'json',
			    success: function (data) { 
			        $("#nuovo").empty();
			        $.each(data, function(index, element) {
			            $("#nuovo").append($('<div>', {
			                text: element.id + " " + element.name + " " + element.country
			            }));
			        });
			       }
			    });
		     });
	      });
		
		</script>	

</body>

</html>
