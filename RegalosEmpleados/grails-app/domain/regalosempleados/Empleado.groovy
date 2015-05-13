package regalosempleados

class Empleado {
	String nombre
	String apellido
	Date cumpleanios
	User usuario	
	Empresa empresa
	
	static hasMany = [regalos: Regalo]
	static constraints = {
		nombre()
		apellido()
		cumpleanios()
		regalos(display: false)		
	}
	static mapping = {
		regalos column: 'usuario_regalo_id', joinTable: false
	}
}