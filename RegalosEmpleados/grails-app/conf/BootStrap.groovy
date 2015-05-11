import regalosempleados.Role
import regalosempleados.User
import regalosempleados.UserRole
import regalosempleados.Empresa

class BootStrap {

	 def init = { servletContext ->
	  
//      def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
//      def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
		 
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
