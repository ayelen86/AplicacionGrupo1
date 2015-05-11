package regalosempleados

class Empresa {

	String nombre
	String direccion
	static hasMany = [empleados: Empleado]
    static constraints = {
		nombre nullable:false
    }
	
	@Override
	public String toString() {
		return nombre;
	}
}
