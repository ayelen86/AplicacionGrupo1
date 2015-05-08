<html>
<head>
	<meta name="layout" content="bootstrap"/>
	<script type="text/javascript">
			function validarForm() {
			  if(document.getElementById("campoUser").value=="") {			       
			    alert('No has ingresado un User'); 
			    return false;
			  }			 	 
			  return true;
			}
		</script>
</head>
<body>
	<div id="general">
    	<g:form method="post" controller="Empleado" action="buscarEmpleadoPorUser" class="form-inline" onsubmit="return validarForm()">
				  <div class="form-group">
				    <label for="exampleInputName2">User:</label>
				    <g:textField class="form-control" id="campoUser" placeholder="Jane Doe" placeholder="Ingrese un empleado" name="empleado" value="${myValue}" />
				  </div>
				  <button class="btn btn-default" id="botonAgregarEmpleado">Buscar</button>
		</g:form>
	</div>
</body>

</html>