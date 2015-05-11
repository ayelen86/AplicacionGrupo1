package regalosempleados

import grails.rest.RestfulController
import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView


import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView
import grails.plugin.springsecurity.annotation.Secured

class EmpleadoController {

	def scaffold = true

	@Secured(['ROLE_ADMIN'])
	def index(){
		
	}
	
	@Secured(['ROLE_ADMIN'])
	def buscarEmpleado(){
		
	}
	
	@Secured(['ROLE_ADMIN'])
	def buscarEmpleadoPorUser(){
		def user = params.empleado;
		def empleadoUser=Empleado.findByUser(user)
		if(empleadoUser){
		
			redirect(uri:"/empleado/show/${empleadoUser.id}")
			}else{
			new ModelAndView("/empleado/error", [mje:"No existe el empleado"])
		}
	
	}
}
