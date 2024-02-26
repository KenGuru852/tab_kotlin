package com.example.pritula_shebanov

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.fragment.app.Fragment


class Third_tab : Fragment() {


    @SuppressLint("ResourceAsColor", "UseCompatLoadingForDrawables")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(com.example.pritula_shebanov.R.layout.third_tab_view, container, false)
        val tableRow = TableRow(context)
        tableRow.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        val tableLayout = rootView.findViewById<TableLayout>(R.id.tablelayoutview)

        val first_row_number = TextView(context)
        first_row_number.setTextColor(Color.WHITE)
        first_row_number.text = "№"
        first_row_number.textSize = 20F
        first_row_number.setPadding(30,30,0,0)
        tableRow.addView(first_row_number)

        val first_row_logo = TextView(context)
        first_row_logo.setTextColor(Color.WHITE)
        first_row_logo.text = "LOG"
        first_row_logo.textSize = 20F
        first_row_logo.setPadding(30,0,0,0)
        tableRow.addView(first_row_logo)

        val first_row_team = TextView(context)
        first_row_team.setTextColor(Color.WHITE)
        first_row_team.text = "Команда"
        first_row_team.textSize = 25F
        first_row_team.setPadding(30,0,0,0)
        tableRow.addView(first_row_team)

        val first_row_rg = TextView(context)
        first_row_rg.setTextColor(Color.WHITE)
        first_row_rg.text = "РГ"
        first_row_rg.textSize = 25F
        first_row_rg.setPadding(40,0,0,0)
        tableRow.addView(first_row_rg)

        val first_row_w = TextView(context)
        first_row_w.setTextColor(Color.WHITE)
        first_row_w.text = "В"
        first_row_w.textSize = 25F
        first_row_w.setPadding(40,0,0,0)
        tableRow.addView(first_row_w)

        val first_row_n = TextView(context)
        first_row_n.setTextColor(Color.WHITE)
        first_row_n.text = "Н"
        first_row_n.textSize = 25F
        first_row_n.setPadding(40,0,0,0)
        tableRow.addView(first_row_n)

        val first_row_p = TextView(context)
        first_row_p.text = "П"
        first_row_p.setTextColor(Color.WHITE)
        first_row_p.textSize = 25F
        first_row_p.setPadding(40,0,0,0)
        tableRow.addView(first_row_p)

        val first_row_o = TextView(context)
        first_row_o.setTextColor(Color.WHITE)
        first_row_o.text = "О"
        first_row_o.textSize = 25F
        first_row_o.setPadding(40,0,0,0)
        tableRow.addView(first_row_o)

//        val liverpool_text = TextView(context)
//        liverpool_text.text = "Ливерпуль"
//        liverpool_text.textSize = 30F
//        liverpool_text.setPadding(30, 20, 0, 0)
//
//        val image_liver = ImageView(context)
//        image_liver.setImageResource(com.example.pritula_shebanov.R.drawable.liverpool)
////
//        tableRow.addView(image_liver)
//        tableRow.addView(liverpool_text)
        tableLayout.addView(tableRow)

        val tableRow_first_place = TableRow(context)
        tableRow_first_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val one_number = TextView(context)
        one_number.text = "1"
        one_number.setTextColor(Color.WHITE)
        one_number.textSize = 25F
        one_number.setPadding(32,30,0,0)
        tableRow_first_place.addView(one_number)

        val image_liver = ImageView(context)
        image_liver.setImageResource(com.example.pritula_shebanov.R.drawable.liverpool)
        image_liver.setPadding(10,0,0,0)
        tableRow_first_place.addView(image_liver)

        val liver_text = TextView(context)
        liver_text.setTextColor(Color.WHITE)
        liver_text.text = "Liverpool"
        liver_text.textSize = 25F
        liver_text.setPadding(32,0,0,0)
        tableRow_first_place.addView(liver_text)

        val liver_g = TextView(context)
        liver_g.setTextColor(Color.WHITE)
        liver_g.text = "26"
        liver_g.textSize = 25F
        liver_g.setPadding(40,0,0,0)
        tableRow_first_place.addView(liver_g)

        val liver_w = TextView(context)
        liver_w.setTextColor(Color.WHITE)
        liver_w.text = "18"
        liver_w.textSize = 25F
        liver_w.setPadding(30,0,0,0)
        tableRow_first_place.addView(liver_w)

        val liver_n = TextView(context)
        liver_n.setTextColor(Color.WHITE)
        liver_n.text = "6"
        liver_n.textSize = 25F
        liver_n.setPadding(45,0,0,0)
        tableRow_first_place.addView(liver_n)

        val liver_l = TextView(context)
        liver_l.setTextColor(Color.WHITE)
        liver_l.text = "2"
        liver_l.textSize = 25F
        liver_l.setPadding(40,0,0,0)
        tableRow_first_place.addView(liver_l)

        val liver_o = TextView(context)
        liver_o.setTextColor(Color.WHITE)
        liver_o.text = "60"
        liver_o.textSize = 25F
        liver_o.setPadding(25,0,0,0)
        tableRow_first_place.addView(liver_o)

        tableLayout.addView(tableRow_first_place)

        val tableRow_second_place = TableRow(context)
        tableRow_second_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val two_number = TextView(context)
        two_number.setTextColor(Color.WHITE)
        two_number.text = "2"
        two_number.textSize = 25F
        two_number.setPadding(32,30,0,0)
        tableRow_second_place.addView(two_number)

        val image_mc = ImageView(context)
        image_mc.setImageResource(com.example.pritula_shebanov.R.drawable.mc)
        image_mc.setPadding(10,0,0,0)
        tableRow_second_place.addView(image_mc)

        val mc_text = TextView(context)
        mc_text.setTextColor(Color.WHITE)
        mc_text.text = "Man City"
        mc_text.textSize = 25F
        mc_text.setPadding(32,0,0,0)
        tableRow_second_place.addView(mc_text)

        val mc_g = TextView(context)
        mc_g.setTextColor(Color.WHITE)
        mc_g.text = "26"
        mc_g.textSize = 25F
        mc_g.setPadding(40,0,0,0)
        tableRow_second_place.addView(mc_g)

        val mc_w = TextView(context)
        mc_w.setTextColor(Color.WHITE)
        mc_w.text = "18"
        mc_w.textSize = 25F
        mc_w.setPadding(30,0,0,0)
        tableRow_second_place.addView(mc_w)

        val mc_n = TextView(context)
        mc_n.text = "5"
        mc_n.setTextColor(Color.WHITE)
        mc_n.textSize = 25F
        mc_n.setPadding(45,0,0,0)
        tableRow_second_place.addView(mc_n)

        val mc_l = TextView(context)
        mc_l.text = "3"
        mc_l.setTextColor(Color.WHITE)
        mc_l.textSize = 25F
        mc_l.setPadding(40,0,0,0)
        tableRow_second_place.addView(mc_l)

        val mc_o = TextView(context)
        mc_o.setTextColor(Color.WHITE)
        mc_o.text = "59"
        mc_o.textSize = 25F
        mc_o.setPadding(25,0,0,0)
        tableRow_second_place.addView(mc_o)

        tableLayout.addView(tableRow_second_place)

        val tableRow_third_place = TableRow(context)
        tableRow_third_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val three_number = TextView(context)
        three_number.text = "3"
        three_number.setTextColor(Color.WHITE)
        three_number.textSize = 25F
        three_number.setPadding(32,30,0,0)
        tableRow_third_place.addView(three_number)

        val image_arsenal = ImageView(context)
        image_arsenal.setImageResource(com.example.pritula_shebanov.R.drawable.arsenal)
        image_arsenal.setPadding(10,0,0,0)
        tableRow_third_place.addView(image_arsenal)

        val arsenal_text = TextView(context)
        arsenal_text.text = "Arsenal"
        arsenal_text.setTextColor(Color.WHITE)
        arsenal_text.textSize = 25F
        arsenal_text.setPadding(32,0,0,0)
        tableRow_third_place.addView(arsenal_text)

        val arsenal_g = TextView(context)
        arsenal_g.setTextColor(Color.WHITE)
        arsenal_g.text = "26"
        arsenal_g.textSize = 25F
        arsenal_g.setPadding(40,0,0,0)
        tableRow_third_place.addView(arsenal_g)

        val arsenal_w = TextView(context)
        arsenal_w.text = "18"
        arsenal_w.setTextColor(Color.WHITE)
        arsenal_w.textSize = 25F
        arsenal_w.setPadding(30,0,0,0)
        tableRow_third_place.addView(arsenal_w)

        val arsenal_n = TextView(context)
        arsenal_n.setTextColor(Color.WHITE)
        arsenal_n.text = "4"
        arsenal_n.textSize = 25F
        arsenal_n.setPadding(45,0,0,0)
        tableRow_third_place.addView(arsenal_n)

        val arsenal_l = TextView(context)
        arsenal_l.text = "4"
        arsenal_l.textSize = 25F
        arsenal_l.setTextColor(Color.WHITE)
        arsenal_l.setPadding(40,0,0,0)
        tableRow_third_place.addView(arsenal_l)

        val arsenal_o = TextView(context)
        arsenal_o.setTextColor(Color.WHITE)
        arsenal_o.text = "58"
        arsenal_o.textSize = 25F
        arsenal_o.setPadding(25,0,0,0)
        tableRow_third_place.addView(arsenal_o)

        tableLayout.addView(tableRow_third_place)

        val tableRow_fourth_place = TableRow(context)
        tableRow_fourth_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val fourth_number = TextView(context)
        fourth_number.text = "4"
        fourth_number.setTextColor(Color.WHITE)
        fourth_number.textSize = 25F
        fourth_number.setPadding(32,30,0,0)
        tableRow_fourth_place.addView(fourth_number)

        val image_aston = ImageView(context)
        image_aston.setImageResource(com.example.pritula_shebanov.R.drawable.aston)
        image_aston.setPadding(10,0,0,0)
        tableRow_fourth_place.addView(image_aston)

        val aston_text = TextView(context)
        aston_text.text = "Aston Villa"
        aston_text.setTextColor(Color.WHITE)
        aston_text.textSize = 22F
        aston_text.setPadding(32,0,0,0)
        tableRow_fourth_place.addView(aston_text)

        val aston_g = TextView(context)
        aston_g.setTextColor(Color.WHITE)
        aston_g.text = "26"
        aston_g.textSize = 25F
        aston_g.setPadding(40,0,0,0)
        tableRow_fourth_place.addView(aston_g)

        val aston_w = TextView(context)
        aston_w.text = "16"
        aston_w.setTextColor(Color.WHITE)
        aston_w.textSize = 25F
        aston_w.setPadding(30,0,0,0)
        tableRow_fourth_place.addView(aston_w)

        val aston_n = TextView(context)
        aston_n.setTextColor(Color.WHITE)
        aston_n.text = "4"
        aston_n.textSize = 25F
        aston_n.setPadding(45,0,0,0)
        tableRow_fourth_place.addView(aston_n)

        val aston_l = TextView(context)
        aston_l.setTextColor(Color.WHITE)
        aston_l.text = "6"
        aston_l.textSize = 25F
        aston_l.setPadding(40,0,0,0)
        tableRow_fourth_place.addView(aston_l)

        val aston_o = TextView(context)
        aston_o.setTextColor(Color.WHITE)
        aston_o.text = "52"
        aston_o.textSize = 25F
        aston_o.setPadding(25,0,0,0)
        tableRow_fourth_place.addView(aston_o)

        tableLayout.addView(tableRow_fourth_place)

        val tableRow_fifth_place = TableRow(context)
        tableRow_fifth_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val fifth_number = TextView(context)
        fifth_number.text = "5"
        fifth_number.setTextColor(Color.WHITE)
        fifth_number.textSize = 25F
        fifth_number.setPadding(32,30,0,0)
        tableRow_fifth_place.addView(fifth_number)

        val image_tth = ImageView(context)
        image_tth.setImageResource(com.example.pritula_shebanov.R.drawable.tth)
        image_tth.setPadding(10,0,0,0)
        tableRow_fifth_place.addView(image_tth)

        val tth_text = TextView(context)
        tth_text.setTextColor(Color.WHITE)
        tth_text.text = "Tottenham"
        tth_text.textSize = 22F
        tth_text.setPadding(32,0,0,0)
        tableRow_fifth_place.addView(tth_text)

        val tth_g = TextView(context)
        tth_g.text = "26"
        tth_g.textSize = 25F
        tth_g.setTextColor(Color.WHITE)
        tth_g.setPadding(40,0,0,0)
        tableRow_fifth_place.addView(tth_g)

        val tth_w = TextView(context)
        tth_w.setTextColor(Color.WHITE)
        tth_w.text = "14"
        tth_w.textSize = 25F
        tth_w.setPadding(30,0,0,0)
        tableRow_fifth_place.addView(tth_w)

        val tth_n = TextView(context)
        tth_n.setTextColor(Color.WHITE)
        tth_n.text = "5"
        tth_n.textSize = 25F
        tth_n.setPadding(45,0,0,0)
        tableRow_fifth_place.addView(tth_n)

        val tth_l = TextView(context)
        tth_l.setTextColor(Color.WHITE)
        tth_l.text = "6"
        tth_l.textSize = 25F
        tth_l.setPadding(40,0,0,0)
        tableRow_fifth_place.addView(tth_l)

        val tth_o = TextView(context)
        tth_o.setTextColor(Color.WHITE)
        tth_o.text = "47"
        tth_o.textSize = 25F
        tth_o.setPadding(25,0,0,0)
        tableRow_fifth_place.addView(tth_o)

        tableLayout.addView(tableRow_fifth_place)

        val tableRow_sixth_place = TableRow(context)
        tableRow_sixth_place.layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val sixth_number = TextView(context)
        sixth_number.text = "6"
        sixth_number.textSize = 25F
        sixth_number.setTextColor(Color.WHITE)
        sixth_number.setPadding(32,30,0,0)
        tableRow_sixth_place.addView(sixth_number)

        val image_mu = ImageView(context)
        image_mu.setImageResource(com.example.pritula_shebanov.R.drawable.mu)
        image_mu.setPadding(10,0,0,0)
        tableRow_sixth_place.addView(image_mu)

        val mu_text = TextView(context)
        mu_text.text = "Man Utd"
        mu_text.setTextColor(Color.WHITE)
        mu_text.textSize = 25F
        mu_text.setPadding(32,0,0,0)
        tableRow_sixth_place.addView(mu_text)

        val mu_g = TextView(context)
        mu_g.text = "26"
        mu_g.setTextColor(Color.WHITE)
        mu_g.textSize = 25F
        mu_g.setPadding(40,0,0,0)
        tableRow_sixth_place.addView(mu_g)

        val mu_w = TextView(context)
        mu_w.text = "14"
        mu_w.setTextColor(Color.WHITE)
        mu_w.textSize = 25F
        mu_w.setPadding(30,0,0,0)
        tableRow_sixth_place.addView(mu_w)

        val mu_n = TextView(context)
        mu_n.text = "2"
        mu_n.textSize = 25F
        mu_n.setTextColor(Color.WHITE)
        mu_n.setPadding(45,0,0,0)
        tableRow_sixth_place.addView(mu_n)

        val mu_l = TextView(context)
        mu_l.text = "10"
        mu_l.setTextColor(Color.WHITE)
        mu_l.textSize = 25F
        mu_l.setPadding(24,0,0,0)
        tableRow_sixth_place.addView(mu_l)

        val mu_o = TextView(context)
        mu_o.text = "44"
        mu_o.setTextColor(Color.WHITE)
        mu_o.textSize = 25F
        mu_o.setPadding(25,0,0,0)
        tableRow_sixth_place.addView(mu_o)

        tableLayout.addView(tableRow_sixth_place)


        return rootView
    }

}