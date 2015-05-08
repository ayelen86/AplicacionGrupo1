package regalosempleados

import grails.rest.RestfulController

class UsuarioRestController extends RestfulController {
	static responseFormats = ['json', 'xml']
	
	public UsuarioRestController() {
		super(Empleado)
	}
	
	def search() {
		def usuario = Empleado.findById(params.Id)
		respond usuario
	}
}
