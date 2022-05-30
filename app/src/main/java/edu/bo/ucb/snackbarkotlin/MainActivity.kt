package edu.bo.ucb.snackbarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val layoutPrincipal : ConstraintLayout
        get() =  findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(layoutPrincipal , getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()
    }
}