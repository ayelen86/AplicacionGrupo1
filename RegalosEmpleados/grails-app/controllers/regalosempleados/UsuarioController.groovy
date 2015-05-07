package regalosempleados

import grails.rest.RestfulController
import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView

class UsuarioController {

	def scaffold = true

	def index(){
		
	}
	
	def buscarEmpleado(){
		
	}
	
	def buscarEmpleadoPorUser(){
		def user = params.user;
		def empleadoUser=Usuario.findByUser(user)
		if(empleadoUser){
		
			redirect(uri:"/usuario/show/${empleadoUser.id}")
			}
	
	}
}
