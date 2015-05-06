package regalosempleados

import grails.rest.RestfulController

class UsuarioRestController extends RestfulController {
	static responseFormats = ['json', 'xml']
	
	public UsuarioRestController() {
		super(Usuario)
	}
	
	def search() {
		def usuario = Usuario.findById(params.Id)
		respond usuario
	}
}
