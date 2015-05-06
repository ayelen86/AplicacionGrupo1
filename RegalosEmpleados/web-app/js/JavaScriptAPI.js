<!-- This is the fully JavaScript code -->
	<!-- AJAX  -->
	function clear5(){
		document.getElementById('restResponses').value = '';
	}
	function getAjax(path){
		if(window.XMLHttpRequest) {
		    peticion_http = new XMLHttpRequest();
		}
		else if(window.ActiveXObject) {
			peticion_http = new ActiveXObject("Microsoft.XMLHTTP");
		}

		peticion_http.onreadystatechange = muestraContenido;
 
		// Realizar peticion HTTP
		peticion_http.open('GET', path, true);
		peticion_http.send(null);
	}
  		<!-- POST -->
  		function postAjax(path){
		if(window.XMLHttpRequest) {
		    peticion_http = new XMLHttpRequest();
		}
		else if(window.ActiveXObject) {
			peticion_http = new ActiveXObject("Microsoft.XMLHTTP");
		}

		peticion_http.onreadystatechange = muestraContenido;
 
		// Realizar peticion HTTP
		peticion_http.open('POST', path, true);
		peticion_http.send(null);
	}
		function muestraContenido() {
	      if(peticion_http.readyState == 4) {
	      	if(peticion_http.status == 200) {

				var obj= JSON.parse(peticion_http.responseText);
	      		document.getElementById('restResponses').value = JSON.stringify(obj, null, 2);
				document.getElementById('restParse').value=obj.results[0].id;
				document.getElementById('imagen').setAttribute("src", obj.results[0].thumbnail);
	      	}
    	  }
  		}
  		<!-- /POST-->
  	<!-- /AJAX -->
<!--  /JavaScript  -->
	
