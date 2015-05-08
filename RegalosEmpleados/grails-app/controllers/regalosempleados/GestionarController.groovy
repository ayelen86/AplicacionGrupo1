package regalosempleados

import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView
import grails.plugin.springsecurity.annotation.Secured

class GestionarController {

	@Secured(['ROLE_ADMIN','ROLE_USER'])
    def index() {
	}

	@Secured(['ROLE_ADMIN'])
	def createListAnio(){
		def ArrayList<Anio> anios=new ArrayList<Anio>()
		for (int i= 1942; i<2100;i++){
			Anio anio = new Anio()
			anio.anio = i
			anios.add(anio)
		}
		return anios
	}
	
	@Secured(['ROLE_ADMIN','ROLE_USER'])
	def verCumpleanieros(){

		def empleados = Empleado.list()
		def cumpleanieros = new ArrayList<Empleado>()
		Date mesActual = new Date()
		for(def empleado : empleados){
			if(mesActual.getMonth() == empleado.getCumpleanios().getMonth()){
				cumpleanieros.add(empleado)
			}
			
		}
		return new ModelAndView("verCumpleanieros", [cumpleanieros: cumpleanieros, mes: mesActual])
		//TODOOO
	}
	
	@Secured(['ROLE_ADMIN','ROLE_USER'])
	def regaloGuardado() {

		def regalo = new Regalo()
		regalo.idMercadolibre = params.regalo
		regalo.anio = new Integer(params.anio)
		
		def empleado = Empleado.findByUser(params.empleado)
		empleado.addToRegalos(regalo).save(flush: true)
	}
	
	@Secured(['ROLE_ADMIN','ROLE_USER'])
	def verRegalo() {
		def listaUsuarios = Empleado.list()
		return new ModelAndView("verRegalo", [empleados: listaUsuarios])
	}

	@Secured(['ROLE_ADMIN'])
	def seleccionarRegalo (){
		def listaUsuarios = Empleado.list()		
		def listaAnios=createListAnio()		
		
		Date d = new Date()

		return new ModelAndView("seleccionarRegalo", [empleados: listaUsuarios, anios: listaAnios])
	}
	
	@Secured(['ROLE_ADMIN','ROLE_USER'])
	def obtenerId() {

		println params.user
		def usuario = Empleado.findById(params.user)
		def resultado = usuario.regalos.collect { it ->
			[idMeli: it.idMercadolibre, anio: it.anio ]
		}
        render resultado as JSON
	}
}
