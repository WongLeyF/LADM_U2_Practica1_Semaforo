package mx.tecnm.tepic.ladm_u2_practica1_semaforo

import android.util.Log

class Hilo(c:Lienzo,carro:Int):Thread(){
    val canvas:Lienzo = c
    val car= carro
    var temp=(1..15).random()
    override fun run() {
        when(car){
            1 -> {

            }
            2 -> {
                while (true){
                    if (posCar2<1080F) posCar2+=1F
                    if (posCar2>=1080F) {
                        posCar2 = -200F
                        temp=(1..15).random()
                    }
                    Log.d("Posx", posCar2.toString()+"-Temp: "+temp)
                    canvas.invalidate()
                    sleep(temp.toLong())
                }
            }
            3 -> {

            }
            4 -> {

            }
            5-> {
                //rojo encendido = #EA3C28 Ap= #9D281A
                //verde encendido = #6DEF14 Ap= #4AA20D
                //amarillo enc = #FDE730 Ap = #B0A121
                while (true){
                    //Amarillo
                    semSup[0] = "#9D281A"
                    semSup[1] = "#FDE730"
                    semSup[2] = "#4AA20D"

                    semInf[0] = "#9D281A"
                    semInf[1] = "#FDE730"
                    semInf[2] = "#4AA20D"
                    canvas.invalidate()
                    sleep(2000)
                    //Verde inferior
                    //rojo encendido = #EA3C28 Ap= #9D281A
                    //verde encendido = #6DEF14 Ap= #4AA20D
                    //amarillo enc = #FDE730 Ap = #B0A121
                    semSup[0] = "#EA3C28"
                    semSup[1] = "#B0A121"
                    semSup[2] = "#4AA20D"

                    semInf[0] = "#9D281A"
                    semInf[1] = "#B0A121"
                    semInf[2] = "#6DEF14"
                    canvas.invalidate()
                    sleep(2000)
                    //Amarillo
                    semSup[0] = "#9D281A"
                    semSup[1] = "#FDE730"
                    semSup[2] = "#4AA20D"

                    semInf[0] = "#9D281A"
                    semInf[1] = "#FDE730"
                    semInf[2] = "#4AA20D"
                    canvas.invalidate()
                    sleep(2000)
                    //Verde Superior
                    semSup[0] = "#9D281A"
                    semSup[1] = "#B0A121"
                    semSup[2] = "#6DEF14"

                    semInf[0] = "#EA3C28"
                    semInf[1] = "#B0A121"
                    semInf[2] = "#4AA20D"
                    canvas.invalidate()
                    sleep(2000)
                }
            }
        }

    }
}