package mx.tecnm.tepic.ladm_u2_practica1_semaforo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lienzo = Lienzo(this)
        setContentView(lienzo)
        var hilo1 = Hilo(lienzo.getLienzo(),1)
        var hilo2 = Hilo(lienzo.getLienzo(),2)
        var hilo3 = Hilo(lienzo.getLienzo(),3)
        var hilo4 = Hilo(lienzo.getLienzo(),4)
        var hilo5 = Hilo(lienzo.getLienzo(),5)
        hilo1.start()
        hilo5.start()
    }
}