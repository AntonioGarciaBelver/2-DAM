package com.jlara.ejpickertema05

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtDate = findViewById<TextView>(R.id.tvDate)
        val c = Calendar.getInstance()
        val mYear = c[Calendar.YEAR]
        val mMonth = c[Calendar.MONTH]
        val mDay = c[Calendar.DAY_OF_MONTH]
        val datePickerDialog = DatePickerDialog(this,
            {datePicker,i,i1,i2 -> "$i2/${i1+1}/$i".also { txtDate.text = it } }, mYear,mMonth,mDay)
        datePickerDialog.show()
        val txtTime = findViewById<TextView>(R.id.tvTime)
        val hour = c[Calendar.HOUR]
        val minute = c[Calendar.MINUTE]
        val timePickerDialog = TimePickerDialog(this,
            {timePicker,i,i1 ->
                val horaFormato  = String.format("%02d:%02d",i,i1)
                horaFormato.also { txtTime.text = it }
            },hour,minute , true)
        timePickerDialog.show()
    }
}