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
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${createLink(controller: 'Gestionar', action: 'index')}">Regalos de Empleados</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${createLink(controller: 'Gestionar', action: 'index')}">Inicio</a></li>
                <li><a href="${createLink(controller: 'Gestionar', action: 'verRegalo')}">Mostrar Regalos</a></li>
                <li><a href="${createLink(controller: 'Gestionar', action: 'verCumpleanieros')}">Cumpleañeros del Mes</a></li>
                <li><a href="${createLink(controller: 'Gestionar', action: 'seleccionarRegalo')}">Seleccionar Regalo</a></li>
                <li><a href="${createLink(controller: 'Usuario', action: 'index')}">Agregar Empleado</a></li>
                <li><a href="${createLink(controller: 'Usuario', action: 'buscarEmpleado')}">Buscar Empleado</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<g:layoutBody/>
</body>
</html>