<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Regalos de Empleados"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
    <g:layoutHead/>
</head>


<body>
    <ul class="nav nav-tabs">
        <li role="presentation" class="active"><a href="${createLink(controller: 'Gestionar', action: 'index')}">Inicio</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Gestionar', action: 'verRegalo')}">Mostrar Regalos</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Gestionar', action: 'verCumpleanieros')}">Cumpleañeros del Mes</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Gestionar', action: 'seleccionarRegalo')}">Seleccionar Regalo</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Empleado', action: 'index')}">Agregar Empleado</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Empleado', action: 'buscarEmpleado')}">Buscar Empleado</a></li>       
        <li role="presentation"><a href="${createLink(controller: 'User', action: 'agregarUsuario')}">Agregar Usuario</a></li>
        <li role="presentation"><a href="${createLink(controller: 'Empresa', action: 'index')}">Agregar Empresa</a></li>
		<li role="presentation"><form name="submitForm" method="POST" action="${createLink(controller: 'logout')}">
								<a href="javascript:document.submitForm.submit()" style="padding-top: 11px">Salir</a></form>
		</li>
    </ul>

<g:layoutBody/>
</body>
</html>