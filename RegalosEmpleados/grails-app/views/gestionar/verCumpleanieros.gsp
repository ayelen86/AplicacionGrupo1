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
<g:select name="usuario" id="selectUser" from="${cumpleanieros}" optionValue="user" optionKey="id" var="user" noSelection="${['':'Seleccionar...']}"/>
   <p>Mes: ${mes.getMonth()}</p>

<ul id="resultadoBusqueda"><p>Regalo:</p> </ul>
</form>

<script type="text/template" id="templateItem">
<li>
    <a href="#url#">#title#</a><img src="#img#"/><p>Año : #anio#</p>
</li>
</script>

</body>
</html>