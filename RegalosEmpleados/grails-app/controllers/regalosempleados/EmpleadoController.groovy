package regalosempleados

import grails.rest.RestfulController
import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView

class EmpleadoController {

	def scaffold = true

	def index(){
		
	}
	
	def buscarEmpleado(){
		
	}
	
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
