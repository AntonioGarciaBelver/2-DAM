package com.jlara.ejemplogridview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapter(context:Context, var layout:Int, var nombres:List<String>) : BaseAdapter() {
    var context:Context?=context

    override fun getCount(): Int {
        return nombres.size
    }

    override fun getItem(position: Int): Any {
        return nombres[position]
    }

    override fun getItemId(id: Int): Long {
        return id.toLong()
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        val nombre=nombres[position]

        //ViewHolder pattern
        var cView = convertView
        val holder: ViewHolder
        if (cView == null) {
            val inflater=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            cView = inflater.inflate(layout,null)
            holder = ViewHolder()
            //Referencia al TextView
            holder.tvNombre = cView.findViewById(R.id.textView)
            cView.tag = holder
        } else {
            holder = cView.tag as ViewHolder
        }

        holder.tvNombre.text = nombre
        return cView!!
    }

    internal class ViewHolder {
        lateinit var tvNombre: TextView
    }
}
