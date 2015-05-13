package regalosempleados
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService;
import org.springframework.web.servlet.ModelAndView

class UserController {

	def scaffold = true
	@Secured(['ROLE_ADMIN_GENERAL','ROLE_ADMIN_EMPRESA'])
	def index(){
	
      }
	@Secured(['ROLE_ADMIN_GENERAL','ROLE_ADMIN_EMPRESA'])
	def agregarUsuario(){
		def empresas = Empresa.list()
		def roles = Role.list()
		return new ModelAndView("agregarUsuario", [empresas: empresas,roles:roles])
	}
	@Secured(['ROLE_ADMIN_GENERAL','ROLE_ADMIN_EMPRESA'])
	def crearUsuario (){
		def empresa = Empresa.findByNombre(params.empresa)
		def rol = Role.findByAuthority(params.rol)
		def usuario = new User (username:params.usuario, password:params.contrasenia, empresa:empresa)
		usuario.save(flush: true)
		UserRole.create usuario, rol, true
		redirect(controller: "Gestionar", action:"index")
		
	}
}
