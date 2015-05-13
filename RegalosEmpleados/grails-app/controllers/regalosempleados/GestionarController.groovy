package regalosempleados

import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService;


class GestionarController {
	
	def springSecurityService

	@Secured(['ROLE_ADMIN_GENERAL','ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
    def index() {
		
	}

	@Secured(['ROLE_ADMIN_GENERAL','ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def createListAnio(){
		def ArrayList<Anio> anios=new ArrayList<Anio>()
		for (int i= 1942; i<2100;i++){
			Anio anio = new Anio()
			anio.anio = i
			anios.add(anio)
		}
		return anios
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def verCumpleanieros(){
		def user = springSecurityService.currentUser
		def empresa=user.empresa		
		def empleados = empresa.empleados		
		def cumpleanieros = new ArrayList<Empleado>()
		Date mesActual = new Date()
		for(def empleado : empleados){
			if(mesActual.getMonth() == empleado.getCumpleanios().getMonth()){
				cumpleanieros.add(empleado)
			}			
		}
		return new ModelAndView("verCumpleanieros", [cumpleanieros: cumpleanieros, mes: mesActual])
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA'])
	def regaloGuardado() {
		def regalo = new Regalo()
		regalo.idMercadolibre = params.regalo
		regalo.anio = new Integer(params.anio)		
		def empleado = Empleado.findById(params.empleadoId)
		empleado.addToRegalos(regalo).save(flush: true)
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def verRegalo() {
		def user = springSecurityService.currentUser
		def empresa=user.empresa
		def listaUsuarios = empresa.empleados		
		return new ModelAndView("verRegalo", [empleados: listaUsuarios])
	}

	@Secured(['ROLE_ADMIN_EMPRESA'])
	def seleccionarRegalo (){
		def user = springSecurityService.currentUser
		def empresa=user.empresa
		def listaUsuarios = empresa.empleados		
		def listaAnios=createListAnio()			
		Date d = new Date()
		return new ModelAndView("seleccionarRegalo", [empleados: listaUsuarios, anios: listaAnios])
	}
	
	@Secured(['ROLE_ADMIN_EMPRESA','ROLE_EMPLEADO'])
	def obtenerId() {
		println params.user
		def usuario = Empleado.findById(params.user)
		def resultado = usuario.regalos.collect { it ->
			[idMeli: it.idMercadolibre, anio: it.anio ]
		}
        render resultado as JSON
	}
}
