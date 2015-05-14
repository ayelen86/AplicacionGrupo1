package regalosempleados

import grails.rest.RestfulController
import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView


import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService;

class EmpleadoController {
	def springSecurityService
	def empleadoService
	def scaffold = true

	@Secured(['ROLE_ADMIN_EMPRESA'])
	def index(){
		
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def buscarEmpleado(){
		
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def buscarEmpleadoPorUser(){
		def empleadoUser = empleadoService.buscarEmpleadoPorUser(params.userName)
		
		if(empleadoUser){
			def empId=empleadoUser.empresa.id
			def user = springSecurityService.currentUser
			def empresaId=user.empresa.id
			
			if(empresaId==empleadoUser.empresa.id){
				redirect(uri:"/empleado/show/${empleadoUser.id}")
			}else{new ModelAndView("/empleado/error", [mje:"No existe el empleado"])}
			
		}else{
				new ModelAndView("/empleado/error", [mje:"No existe el empleado"])}	
	}
}
