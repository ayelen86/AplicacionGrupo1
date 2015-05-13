<%--
  Created by IntelliJ IDEA.
  User: imatellan
  Date: 27/04/2015
  Time: 02:34 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="bootstrap"/>
	<asset:javascript src="application.js"/>
	<title>Asignacion de Regalo</title>
</head>
<body>
<br/>
<br/>
<br/>
<br/>
<br/>
<form class="navbar-form">
<h3>
	<p><input type="text" id="meliquery" name="query" placeholder="Busque aqui un regalo..." /></p>
	</h3>
	</form>
	<br/>
	<br/>
	<form class="navbar-form" action="${createLink(controller: "gestionar", action: "regaloGuardado")}" method='POST'>
	<h3>
		Seleccionar usuario:
		<g:select name="empleadoId" from="${empleados}" optionValue="usuario" optionKey="id"/>
		<br/>
		<br/>
		Seleccionar año:
		<g:select name="anio" from="${anios}" optionValue="anio" optionKey="anio"/>
		<br/>
		<br/>
		</h3>
		
		<ul id="resultadoBusqueda"> </ul>
		<input type="submit" value="Guardar">
	</form>
	<script type="text/template" id="templateItem">
		<li>
			<a href="#url#">#title#</a><img src="#img#"/>
			<input type="radio" name="regalo" value="#idMeli#" />
		</li>
	</script>
</body>
</html>