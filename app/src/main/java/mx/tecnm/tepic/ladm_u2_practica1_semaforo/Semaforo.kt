package mx.tecnm.tepic.ladm_u2_practica1_semaforo

class Semaforo (c:Lienzo):Thread(){

    val canvas:Lienzo = c
    override fun run() {
        while (true) {
            amarillo()
            sigaInf()
            amarillo()
            sigaSup()

        }
    }
    private fun amarillo(){
        semSup[0] = "#9D281A"
        semSup[1] = "#FDE730"
        semSup[2] = "#4AA20D"

        semInf[0] = "#9D281A"
        semInf[1] = "#FDE730"
        semInf[2] = "#4AA20D"
        canvas.invalidate()
        sleep(2000)
    }
    private fun sigaInf(){//Carro 1,3
        semSup[0] = "#EA3C28"
        semSup[1] = "#B0A121"
        semSup[2] = "#4AA20D"

        semInf[0] = "#9D281A"
        semInf[1] = "#B0A121"
        semInf[2] = "#6DEF14"
        canvas.invalidate()
        semaforo = false
        sleep(8500)
    }
    private fun sigaSup(){//Carro 2,4
        //rojo encendido = #EA3C28 Ap= #9D281A
        //verde encendido = #6DEF14 Ap= #4AA20D
        //amarillo enc = #FDE730 Ap = #B0A121
        semSup[0] = "#9D281A"
        semSup[1] = "#B0A121"
        semSup[2] = "#6DEF14"

        semInf[0] = "#EA3C28"
        semInf[1] = "#B0A121"
        semInf[2] = "#4AA20D"
        canvas.invalidate()
        semaforo = true
        sleep(8500)
    }
}