package regalosempleados

import grails.converters.JSON
import org.springframework.web.servlet.ModelAndView

class GestionarController {

    def index() {
	}

	def verCumpleanieros(){

		def empleados = Usuario.list()
		def cumpleanieros = new ArrayList<Usuario>()
		Date mesActual = new Date()
		for(def empleado : empleados){
			if(mesActual.getMonth() == empleado.getCumpleanios().getMonth()){
				cumpleanieros.add(empleado)
			}
			
		}
		return new ModelAndView("verCumpleanieros", [cumpleanieros: cumpleanieros, mes: mesActual])
		//TODOOO
	}
	
	def regaloGuardado() {

		def regalo = new Regalo()
		regalo.idMercadolibre = params.regalo
		regalo.anio = new Integer(params.anio)
		
		def empleado = Usuario.findByUser(params.user)
		empleado.addToRegalos(regalo).save(flush: true)
	}
	
	def verRegalo() {
		def listaUsuarios = Usuario.list()
		def listaAnios = Anio.list()

		return new ModelAndView("verRegalo", [usuarios: listaUsuarios, anios: listaAnios])
	}

	def seleccionarRegalo (){
		def listaUsuarios = Usuario.list()
		def listaAnios = Anio.list()
		Date d = new Date()

		return new ModelAndView("seleccionarRegalo", [usuarios: listaUsuarios, anios: listaAnios])
	}
	
	def obtenerId() {

		println params.user
		def usuario = Usuario.findById(params.user)
		def resultado = usuario.regalos.collect { it ->
			[idMeli: it.idMercadolibre, anio: it.anio ]
		}
        render resultado as JSON
	}
}
