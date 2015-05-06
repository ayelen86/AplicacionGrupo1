package regalosempleados

class AnioController {
    static scaffold = true

    def createList(){
        for (int i= 1942; i<2391;i++){
            Anio anio = new Anio()
            anio.anio = i
            anio.save()
        }
    }
}
