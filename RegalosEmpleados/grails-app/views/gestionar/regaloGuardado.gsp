<html>
<head>
    <meta name="layout" content="bootstrap"/>
    <%--<asset:javascript src="busqueda.js"/>--%>
    <title>Regalo Guardado</title>
</head>
<body>
<br/><br/><br/><br/>
<br/>
<div class="navbar-form">
<h3>
	<br/><br/>
			<%--<img src="#img#"/>--%>
	<br/><br/>
	Regalo asignado al empleado!
	<br/>
	<br/>
	</h3>
	<form action="${createLink(controller: "gestionar", action: "index")}" method='POST'>
		<input type="submit" value="Volver al Inicio">
	</form>
</div>
</body>

</html>