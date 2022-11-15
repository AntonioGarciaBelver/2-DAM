package com.jlara.ejemplogridview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.view.ContextMenu.ContextMenuInfo
import android.widget.AdapterView.AdapterContextMenuInfo
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var nombres:MutableList<String>
    private lateinit var adapter: MyAdapter
    private var contador:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView:GridView = findViewById(R.id.gridView)
        nombres=mutableListOf("Luis","Ruben","Jose","Santiago","Luisa","Roberto","Josefina","Maria","Lorena",
        "Renato","Juan","Sofia","Lara","Juliana","Manuel","Susana","Pedro","Pablo","Felipe","Antonia",
        "Ines","Sonia","Alberto","Paula","Gustavo","Alfonso","Irene")
        adapter = MyAdapter(this, R.layout.grid_item, nombres)
        gridView.adapter=adapter
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(
                this, "Has hecho click sobre " +
                        nombres.get(position), Toast.LENGTH_SHORT
            ).show()
        }
        registerForContextMenu(gridView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.add_item -> {
                nombres.add("Nuevo nº" + ++contador)
                adapter.notifyDataSetChanged()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View?, menuInfo: ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        val info = menuInfo as AdapterContextMenuInfo
        menu.setHeaderTitle(nombres[info.position])
        inflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as AdapterContextMenuInfo
        return when (item.itemId) {
            R.id.delete_item -> {
                nombres.removeAt(info.position)
                adapter.notifyDataSetChanged()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}


