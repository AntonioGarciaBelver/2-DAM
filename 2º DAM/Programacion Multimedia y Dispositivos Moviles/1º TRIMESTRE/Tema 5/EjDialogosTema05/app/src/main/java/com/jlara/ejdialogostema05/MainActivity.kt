package com.jlara.ejdialogostema05

import android.app.Activity
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var dialogo:Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dialogo = AlertDialog.Builder(this)
            .setTitle("Título del diálogo")
            .setMessage("Texto del mensaje")
            .setNeutralButton("Cerrar", null).create()
        dialogo.show()
        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        btnDialog1.setOnClickListener(this)
        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        btnDialog2.setOnClickListener(this)
        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener(this)
        val btnDialog4 = findViewById<Button>(R.id.btnDialog4)
        btnDialog4.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.btnDialog1 -> {dialogo = AlertDialog.Builder(this)
                    .setTitle("Diálogo del botón 1")
                    .setMessage("Este es el diálogo del botón 1. ¿Quiere salir de la app?")
                    .setPositiveButton("Sí") { dialogInterface, i -> finish() }
                    .setNegativeButton("No") { dialogInterface, i -> dialogInterface.cancel() }
                    .create()
                    dialogo.show()}
                R.id.btnDialog2 -> {val items= arrayOf("Rojo","Verde","Azul")
                    val builder=AlertDialog.Builder(this)
                    builder.setTitle("Elige un color")
                    builder.setItems(items){dialogInterface, i ->
                        Toast.makeText(applicationContext, items[i], Toast.LENGTH_SHORT).show()
                    }
                    builder.create()
                    builder.show()
                }
                R.id.btnDialog3 -> {val items= arrayOf("Rojo","Verde","Azul")
                    val builder=AlertDialog.Builder(this)
                    builder.setTitle("Elige un color")
                    builder.setSingleChoiceItems(items,1){dialogInterface, i ->
                        Toast.makeText(applicationContext, items[i], Toast.LENGTH_SHORT).show()
                    }
                    builder.create()
                    builder.show()
                }
                R.id.btnDialog4 -> {val items= arrayOf("Rojo","Verde","Azul")
                    val checkedItems= booleanArrayOf(false,false,false)
                    val builder=AlertDialog.Builder(this)
                    builder.setTitle("Elige un color")
                    builder.setMultiChoiceItems(items,checkedItems){dialogInterface, i, b ->
                        var resultado = ""
                        for (j in checkedItems.indices)
                        {
                            if (checkedItems[j]) resultado+= " "+items[j]
                        }
                        Toast.makeText(applicationContext, resultado, Toast.LENGTH_SHORT).show()
                    }
                    builder.create()
                    builder.show()
                }
            }
        }

    }
}
