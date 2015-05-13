package regalosempleados
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService;
import org.springframework.web.servlet.ModelAndView

class EmpresaController {
	
	
	def scaffold = true
	@Secured(['ROLE_ADMIN_GENERAL'])
	def index(){
		
	}
    
	
	
}
