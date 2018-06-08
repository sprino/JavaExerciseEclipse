<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous">
</script>

<head>
<title>Test ajax</title>
</head>

<body>
	<h1>Test ajax</h1>
	
	<c:out value="${message}" />
	<br>
	<div id="message">${message}</div>
	<br>
	<div>
		<button id="micro">Try it</button>
		<p id="nuovo"></p>
	</div>

	<button id="mostraUtenti" type="submit">Button</button>

	<table id="utenti"></table>


	<script type="text/javascript">
		$(function($) {
			$("#micro").one("click", function() {

				$.ajax({
					url : "/spring-mvc/micro"
				}).then(function(data) {
					$("#nuovo").append(data);
				});

			});
		});
	</script>


	<script type="text/javascript">
		$("#mostraUtenti")
				.one(
						"click",
						function() {
							$
									.get(
											"http://localhost:8080/spring-mvc/microutenti",
											function(data) {
												$("#utenti")
														.append(
																"<tr><th>Nome</th><th>Cognome</th><th>Età</th>")
												$
														.each(
																data,
																function(i,
																		contact) {
																	$("#utenti")
																			.append(
																					"<tr><td>"
																							+ contact.nome
																							+ "</td>"
																							+ "<td>"
																							+ contact.cognome
																							+ "</td>"
																							+ "<td>"
																							+ contact.età
																							+ "</td></tr>");
																});
											});
						});
	</script>

</body>
</html>