package com.example.pritula_shebanov

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class Second_tab : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.second_tab_view, container, false)
        var list_view: ListView = rootView.findViewById(R.id.listviewxml)

        var shedule: List<String> = listOf<String>("first one", "second", "third", "fourth", "fifth")
        val adapterS = activity?.let{
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                shedule
            )
        }
        list_view.adapter = CustomAdapter(this.requireContext(), shedule)
        return rootView
    }

}