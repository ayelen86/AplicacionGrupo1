<html>
<head>
	<meta name="layout" content="bootstrap"/>
<%--	<script type="text/javascript">--%>
<%--			function validarForm() {--%>
<%--			  if(document.getElementById("campoUser").value=="") {			       --%>
<%--			    alert('No has ingresado un User'); --%>
<%--			    return false;--%>
<%--			  }			 	 --%>
<%--			  return true;--%>
<%--			}--%>
<%--		</script>--%>
</head>
<body>
	<div id="general">
    	<g:form method="post" controller="User" action="crearUsuario" class="form-inline" onsubmit="return validarForm()">
				  <div class="form-group">
				  
				   <label for="exampleInputName2">Usuario:</label>
				   <g:textField class="form-control" id="campoUser" placeholder="Jane Doe" placeholder="Ingrese un usuario" name="usuario" value="${myValue}" /><br>
				   <label for="exampleInputName2">Contraseña:</label>
				   <g:textField class="form-control" id="campoUser" placeholder="Jane Doe" placeholder="Ingrese una contraseña" name="contrasenia" value="${myValue}" /><br>
				   <label for="exampleInputName2">Empresa:</label>
				   <g:select name="empresa" from="${empresas}" optionValue="nombre" optionKey="nombre"/><br>
				   <label for="exampleInputName2">Rol:</label>
				   <g:select name="rol" from="${roles}" optionValue="authority" optionKey="authority"/><br>
				  
				  <button class="btn btn-default" id="botonAgregarEmpleado">Guardar</button>
				  </div>
				  
		</g:form>
	</div>
</body>

</html>