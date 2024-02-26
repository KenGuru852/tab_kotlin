package com.example.pritula_shebanov

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat

class CustomAdapter (context: Context, private val items: List<String>) : ArrayAdapter<String>(context, R.layout.listviewitem, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent)
        val textView = view.findViewById<TextView>(R.id.textView)

        // Устанавливаем цвет текста
        textView.setTextColor(ContextCompat.getColor(context, R.color.white))

        return view
    }
}