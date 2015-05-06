package regalosempleados

class Regalo {
	static belongsTo = [usuario: Usuario]
    String idMercadolibre
	int anio
    static constraints = {
    }
}
