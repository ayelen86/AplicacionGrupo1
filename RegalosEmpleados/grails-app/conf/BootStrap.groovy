import regalosempleados.Role
import regalosempleados.User
import regalosempleados.UserRole
import regalosempleados.Empresa

class BootStrap {

	 def init = { servletContext ->
	  
//      def adminRole = new Role(authority: 'ROLE_ADMIN_GENERAL').save(flush: true)
//      def adminEmpresaRole = new Role(authority: 'ROLE_ADMIN_EMPRESA').save(flush: true)
//	  def empleadoRole = new Role(authority: 'ROLE_EMPLEADO').save(flush: true)
//	  
//	  def acc= new Empresa(nombre:'Accenture',direccion: 'Diagonal 80 y 48')
//	  acc.save(flush: true)
//	  
//	  def userGeneral = new User(username: 'ayelen', password: '123',empresa:acc)
//	  userGeneral.save(flush: true)
//	  UserRole.create userGeneral, adminRole, true
//	  
//	  def userEmpresa  = new User(username: 'empresa', password: '123',empresa:acc)
//	  userEmpresa.save(flush: true)
//	  UserRole.create userEmpresa, adminEmpresaRole, true
//	  
//	  def userEmpleado  = new User(username: 'empleado', password: '123',empresa:acc)
//	  userEmpleado.save(flush: true)
//	  UserRole.create userEmpleado, empleadoRole, true
//	  
//	  assert User.count() == 3
//	  assert Role.count() == 3
//	  assert UserRole.count() == 3
/*	 
		 
//		 ACCENTURE	  	  
	  def accRole = new Role(authority: 'ROLE_ACC').save(flush: true)  
	  def acc= new Empresa(nombre:'Accenture',direccion: 'Diagonal 80 y 48')
	  acc.save(flush: true)
  
      def userAcc1 = new User(username: 'andrea', password: '123',empresa:acc)
      userAcc1.save(flush: true)
      UserRole.create userAcc1, accRole, true	  
 
	  def userAcc2 = new User(username: 'viviana', password: '123',empresa:acc)
	  userAcc2.save(flush: true)
	  UserRole.create userAcc2, accRole, true	  
	  
//	  BVISION
	  def bvRole = new Role(authority: 'ROLE_BV').save(flush: true)
	  
	  def bv= new Empresa(nombre:'Bvison',direccion: 'Calle 57 entre 7 y 8')
	  bv.save(flush: true)	  
	  
	  def userBv1 = new User(username: 'ayelen', password: '123', empresa:bv)
	  userBv1.save(flush: true)
	  UserRole.create userBv1, bvRole, true	  
	  
	  def userBv2 = new User(username: 'sabrina', password: '123', empresa:bv)
	  userBv2.save(flush: true)
	  UserRole.create userBv2, bvRole, true
	  
      assert User.count() == 4
      assert Role.count() == 2
      assert UserRole.count() == 4
*/

   }
	
		 
    def destroy = {
    }
}
