class UrlMappings {

	static mappings = {
		"/UsuarioRest"(resources: "UsuarioRest")
		"/UsuarioRest/search(.$format)?"(controller: "UsuarioRest", action: "search")
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//Se agrega linea para habilitar el index de app sin Home de Grails
		"/"(controller:"/gestionar/index")
		
//	Se comenta linea para inhabilitar el ingreso directo mediante Home de Grails		
//        "/"(view:"/index")
        "500"(view:'/error')
		
	}
}
