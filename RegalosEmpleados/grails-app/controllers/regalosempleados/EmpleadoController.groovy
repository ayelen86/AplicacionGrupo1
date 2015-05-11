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

	def scaffold = true

	@Secured(['ROLE_BV','ROLE_ACC'])
	def index(){
		
	}
	
	@Secured(['ROLE_BV','ROLE_ACC'])
	def buscarEmpleado(){
		
	}
	
	@Secured(['ROLE_BV','ROLE_ACC'])
	def buscarEmpleadoPorUser(){
		def empleado = params.empleado;
		def empleadoUser=Empleado.findByUser(empleado)
		
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
