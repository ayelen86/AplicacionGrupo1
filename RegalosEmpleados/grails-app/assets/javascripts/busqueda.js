$(function() {
	$("#meliquery").keypress( enviarConsulta );
	function enviarConsulta() {
		setTimeout(function() {
		var query = "https://api.mercadolibre.com/sites/MLA/search?q=" + $("#meliquery").val();
		var promise = $.get(query);
		promise.done( recibirResultados );
		}, 0);
	}
	function recibirResultados( json ) {
		$("#resultadoBusqueda").empty();
		json.results.forEach(function(item) {
		var str = $("#templateItem").text()
		str = str.replace(/#url#/g, item.permalink);
		str = str.replace(/#title#/g, item.title);
		str = str.replace(/#img#/g, item.thumbnail)
		str = str.replace(/#idMeli#/g, item.id)
		$("#resultadoBusqueda").append(str);
		})
	}
});

$(function () {
	$("#selectUser").change( obtenerIdMeli );
	
	function obtenerIdMeli() {
		setTimeout(function() {
			var query = "/RegalosEmpleados/gestionar/obtenerId?user=" + $("#selectUser").val();
			var promise = $.get(query);
			promise.done( enviarConsulta );
			}, 0);
	}
	
	function enviarConsulta( listaJson ) {
		$("#resultadoBusqueda").empty();
		listaJson.forEach(function(item) {
			var anio = item.anio;
			var query = "https://api.mercadolibre.com/items/" + item.idMeli;
			var promise = $.get(query);
			promise.done( recibirResultados );
			
			function recibirResultados( json ) {
				var str = $("#templateItem").text()
				str = str.replace(/#anio#/g, anio);
				str = str.replace(/#url#/g, json.permalink);
				str = str.replace(/#title#/g, json.title);
				str = str.replace(/#img#/g, json.thumbnail)
				$("#resultadoBusqueda").append(str);
			}
		})
	}
});