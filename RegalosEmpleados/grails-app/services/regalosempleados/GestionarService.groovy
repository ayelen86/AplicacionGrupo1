package regalosempleados

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService

@Transactional
class GestionarService {
	
	def springSecurityService

    def listarAnios() {
		def ArrayList<Anio> anios=new ArrayList<Anio>()
		for (int i= 1942; i<2100;i++){
			Anio anio = new Anio()
			anio.anio = i
			anios.add(anio)
		}
		return anios

    }
	
	def empleadosDeUnaEmpresa(){
		def user = springSecurityService.currentUser
		def empresa=user.empresa
		def empleados = empresa.empleados
		return empleados
	}
	
	def guardarRegalo(regaloId,anio,empleadoId){
		def regalo = new Regalo()
		regalo.idMercadolibre = regaloId
		regalo.anio = new Integer(anio)
		def empleado = Empleado.findById(empleadoId)
		empleado.addToRegalos(regalo).save(flush: true)
	}
}
