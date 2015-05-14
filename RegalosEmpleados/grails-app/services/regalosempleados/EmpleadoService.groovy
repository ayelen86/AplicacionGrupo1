package regalosempleados

import grails.transaction.Transactional

@Transactional
class EmpleadoService {

    def buscarEmpleadoPorUser(userName) {
		def usuario=User.findByUsername(userName)
		def empleadoUser=Empleado.findByUsuario(usuario)
	return empleadoUser
    }
}
