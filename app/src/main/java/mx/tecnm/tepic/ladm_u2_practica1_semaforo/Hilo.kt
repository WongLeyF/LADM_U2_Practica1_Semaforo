package mx.tecnm.tepic.ladm_u2_practica1_semaforo

class Hilo(canvas:Lienzo, carro:Int):Thread(){
    private val c:Lienzo = canvas
    private val car= carro
    private var temp=(10..75).random()
    override fun run() {

        when(car){
            1 -> {
                while (true){
                    if (!(semaforo && posCar1 == 1270F)){
                        if (!(getWait24()&&posCar1 == 1270F)) {
                            posCar1 -= 5F
                        }
                    }
                    if (posCar1 <= -600F) {
                        posCar1 = 2600F
                        temp = (10..75).random()
                    }
                    c.invalidate()
                    sleep(temp.toLong())
                }
            }
            2 -> {
                while (true){
                    if (!(!semaforo && posCar2==-140F)){
                        if (!(getWait13()&&posCar2==-140F)){
                            posCar2 +=5F
                        }
                    }
                    if (posCar2 >= 1080F) {
                        posCar2 = -600F
                        temp = (10..75).random()

                    }
                    c.invalidate()
                    sleep(temp.toLong())
                }
            }
            3 -> {
                while (true){
                    if (!(semaforo && posCar3 == 320F)){
                        if (!(getWait24()&&posCar3 == 320F)) {
                            posCar3 +=5F
                        }
                    }
                    if (posCar3 >= 2500F) {
                        posCar3 = -600F
                        temp = (10..75).random()
                    }
                    c.invalidate()
                    sleep(temp.toLong())
                }
            }
            4 -> {
                while (true){
                    if (!(!semaforo && posCar4==810F)) {
                        if (!(getWait13() && posCar4==810F)){
                            posCar4 -= 5F
                        }
                    }
                    if (posCar4 <= -600F) {
                        posCar4 = 1280F
                        temp = (10..75).random()
                    }
                    c.invalidate()
                    sleep(temp.toLong())
                }
            }
        }
    }

    private fun getWait13():Boolean{
        return (posCar1<1260F&& posCar1>350F)||(posCar3<1260F&& posCar3>350F)
    }
    private fun getWait24():Boolean{
        return (posCar2<810F && posCar2>-140F)||(posCar4<810F&& posCar4>-140F)
    }
}