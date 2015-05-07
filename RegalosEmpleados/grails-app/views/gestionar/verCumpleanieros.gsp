<%--
  Created by IntelliJ IDEA.
  User: imatellan
  Date: 30/04/2015
  Time: 03:24 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="bootstrap"/>
    <asset:javascript src="application.js"/>
    <title>Este Mes Cumplen</title>
</head>

<body>
<br/><br/><br/><br/>
<br/>
<form class="navbar-form">
<h3>
<g:select name="usuario" id="selectUser" from="${cumpleanieros}" optionValue="user" optionKey="id" var="user" noSelection="${['':'Seleccionar Usuario...']}"/>
   <br/>
   <br/>	
   <p>Mes: ${mes.getMonth()+1}</p>
	<br/>
<ul id="resultadoBusqueda"><p></p> </ul>
</h3>
</form>

<script type="text/template" id="templateItem">
<li>
    <a href="#url#">#title#</a><img src="#img#"/><p>Año: #anio#</p>
</li>
</script>

</body>
</html>