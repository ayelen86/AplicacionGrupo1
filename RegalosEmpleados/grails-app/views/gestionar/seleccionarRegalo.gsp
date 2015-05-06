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
	<title>Seleccionar Regalo</title>
</head>
<body>
<br/>
<br/>
<br/>
<br/>
<br/>
	<p><input type="text" id="meliquery" name="query" placeholder="Busque aqui..." /></p>
	<br/>
	<br/>
	<form action="${createLink(controller: "gestionar", action: "regaloGuardado")}" method='POST'>
		Seleccionar usuario:
		<g:select name="user" from="${usuarios}" optionValue="user" optionKey="user"/>
		<br/>
		<br/>
		Seleccionar año:
		<g:select name="anio" from="${anios}" optionValue="anio" optionKey="anio"/>
		<br/>
		<br/>
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