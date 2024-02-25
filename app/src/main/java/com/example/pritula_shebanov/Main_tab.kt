package com.example.pritula_shebanov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab

class Main_tab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_tab_view)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)

        var viewpager: ViewPager = findViewById(R.id.viewpager)

        var tabs: TabLayout = findViewById(R.id.tabs)

        viewpager.adapter = fragmentAdapter

        tabs.setupWithViewPager(viewpager)

    }
}