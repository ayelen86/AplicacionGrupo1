<html>
<head>
	<meta name="layout" content="bootstrap"/>
</head>
<body>
 	<br/>
<br/>
<br/>
<br/>
	<h2>Busqueda de Regalos</h2>
	<form class="navbar-form">
		<h3>Usuario:</h3>	
		<g:select name="usuario" id="selectUser" from="${usuarios}" optionValue="user" optionKey="id" var="user" noSelection="${['':'Seleccionar...']}"/>	
		<br>
				
		<ul id="resultadoBusqueda"> </ul>
	</form>
	
	<script type="text/template" id="templateItem">
		<li>
			<h3>#anio#</h3><a href="#url#">#title#</a><img src="#img#" height="100" width="100"/>
		</li>
	</script>
	
	<form action="${createLink(controller: "gestionar", action: "index")}" method='POST'>
		<input type="submit" value="Volver">
	</form>
	
</body>

</html>