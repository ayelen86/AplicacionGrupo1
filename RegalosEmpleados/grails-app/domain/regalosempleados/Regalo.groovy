package regalosempleados

class Regalo {
	static belongsTo = [empleado: Empleado]
    String idMercadolibre
	int anio
    static constraints = {
    }
}
