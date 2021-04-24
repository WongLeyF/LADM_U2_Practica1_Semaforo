package mx.tecnm.tepic.ladm_u2_practica1_semaforo

import android.graphics.*
import android.view.View
var posCar1:Float = 2600F
var posCar2:Float = -600F
var posCar3:Float = -600F
var posCar4:Float = 1280F
var semSup = arrayOf("#9D281A", "#B0A121", "#6DEF14")
var semInf = arrayOf("#EA3C28", "#B0A121", "#4AA20D")


class Lienzo(p: MainActivity): View(p)
{

    var car1 = BitmapFactory.decodeResource(this.resources, R.drawable.carro1)
    var car2 = BitmapFactory.decodeResource(this.resources, R.drawable.carro2)
    var car3 = BitmapFactory.decodeResource(this.resources, R.drawable.carro3)
    var car4 = BitmapFactory.decodeResource(this.resources, R.drawable.carro4)

    //rojo encendido = #EA3C28 Ap= #9D281A
    //amarillo enc = #FDE730 Ap = #B0A121
    //verde encendido = #6DEF14 Ap= #4AA20D

    fun getLienzo(): Lienzo{
        return this
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p = Paint()
        canvas.drawColor(Color.parseColor("#FFFFFF"))
        p.color = Color.parseColor("#757575")
        //Carretera izq-der
        canvas.drawRect(0F, 730F, 1080F, 1270F,p)
        //Carretera sup-inf
        canvas.drawRect(270F, 0F, 810F, 2340F,p)
        //Lineas Blancas intermedias
        p.color = Color.parseColor("#FFFFFF")
        //Lineas izquierda
        canvas.drawRect(60F, 980F, 120F, 1000F,p)
        canvas.drawRect(200F, 980F, 260F, 1000F,p)
        //Lineas Derecha
        canvas.drawRect(810F, 980F, 870F, 1000F,p)
        canvas.drawRect(950F, 980F, 1010F, 1000F,p)
        //Lineas Superior
        canvas.drawRect(530F, 60F, 550F, 120F,p)
        canvas.drawRect(530F, 200F, 550F, 260F,p)
        canvas.drawRect(530F, 340F, 550F, 400F,p)
        canvas.drawRect(530F, 480F, 550F, 540F,p)
        canvas.drawRect(530F, 620F, 550F, 680F,p)
        //Lineas Inferior
        canvas.drawRect(530F, 1320F, 550F, 1380F,p)
        canvas.drawRect(530F, 1460F, 550F, 1520F,p)
        canvas.drawRect(530F, 1580F, 550F, 1640F,p)
        canvas.drawRect(530F, 1720F, 550F, 1780F,p)
        canvas.drawRect(530F, 1860F, 550F, 1920F,p)

        //Semaforo Superior
        //rojo encendido = #EA3C28 Ap= #9D281A
        //verde encendido = #6DEF14 Ap= #4AA20D
        //amarillo enc = #FDE730 Ap = #B0A121
        p.color = Color.parseColor("#383838")
        canvas.drawRect(30F, 60F, 220F, 660F,p)
        p.color = Color.parseColor(semSup[0])
        canvas.drawCircle(125F,180F,80F,p)
        p.color = Color.parseColor(semSup[1])
        canvas.drawCircle(125F,360F,80F,p)
        p.color = Color.parseColor(semSup[2])
        canvas.drawCircle(125F,540F,80F,p)

        //Semaforo Inferior
        //rojo encendido = #EA3C28 Ap= #9D281A
        //verde encendido = #6DEF14 Ap= #4AA20D
        //amarillo enc = #FDE730 Ap = #B0A121
        p.color = Color.parseColor("#383838")
        canvas.drawRect(850F, 1330F, 1040F, 1930F,p)
        p.color = Color.parseColor(semInf[0])
        canvas.drawCircle(945F,1450F,80F,p)
        p.color = Color.parseColor(semInf[1])
        canvas.drawCircle(945F,1630F,80F,p)
        p.color = Color.parseColor(semInf[2])
        canvas.drawCircle(945F,1810F,80F,p)

        canvas.drawBitmap(car1,580F, posCar1,p)
        canvas.drawBitmap(car2,posCar2,1020F,p)
        canvas.drawBitmap(car3,280F, posCar3,p)
        canvas.drawBitmap(car4, posCar4,750F,p)

    }
}
