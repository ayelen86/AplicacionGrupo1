import regalosempleados.Role
import regalosempleados.User
import regalosempleados.UserRole

class BootStrap {

	 def init = { servletContext ->

      def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
      def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

      def userAdmin = new User(username: 'andrea', password: '123')
      userAdmin.save(flush: true)
      UserRole.create userAdmin, adminRole, true
	  
	  def user = new User(username: 'viviana', password: '1234')
	  user.save(flush: true)
	  UserRole.create user, userRole, true

      assert User.count() == 2
      assert Role.count() == 2
      assert UserRole.count() == 2
   }
		
    def destroy = {
    }
}
