package mx.tecnm.tepic.ladm_u2_practica1_semaforo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lienzo = Lienzo(this)
        setContentView(lienzo)
        val hilo1 = Hilo(lienzo.getLienzo(),1)
        val hilo2 = Hilo(lienzo.getLienzo(),2)
        val hilo3 = Hilo(lienzo.getLienzo(),3)
        val hilo4 = Hilo(lienzo.getLienzo(),4)
        val hilo5 = Semaforo(lienzo.getLienzo())
            hilo1.start()
            hilo2.start()
            hilo3.start()
            hilo4.start()
            hilo5.start()
        //
    }
}