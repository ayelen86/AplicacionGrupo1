package regalosempleados

class Empleado {
	String nombre
	String apellido
	Date cumpleanios
	String user	
//	User user
	Empresa empresa
	
	static hasMany = [regalos: Regalo]
	static constraints = {
		nombre()
		apellido()
		cumpleanios()
		user(minSize: 5)
		regalos(display: false)		
	}
	static mapping = {
		regalos column: 'usuario_regalo_id', joinTable: false
	}
}