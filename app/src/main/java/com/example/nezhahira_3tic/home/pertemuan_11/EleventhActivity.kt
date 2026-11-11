package com.example.nezhahira_3tic.home.pertemuan_11

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nezhahira_3tic.R
import com.example.nezhahira_3tic.databinding.ActivityEleventhBinding
import com.google.android.material.tabs.TabLayoutMediator

class EleventhActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEleventhBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEleventhBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Halaman Pertemuan 11"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        }

        // 1. Inisialisasi adapter
        val tabsAdapter = EleventhTabsAdapter(this)
// 2. Pasang adapter ke ViewPager2
        binding.viewPager.adapter = tabsAdapter
// 3. Hubungkan TabLayout dan ViewPager2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
// Atur judul untuk setiap tab
            when (position) {
                0 -> {
                    tab.text = "Tab A"
// Tambah ikon
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.outline_add_home_24)
// Badge tanpa angka (hanya titik)
                    val badge = tab.getOrCreateBadge()
                    badge.isVisible = true
                }
                1 -> {
                    tab.text = "Tab B"
// Tambah ikon
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.outline_add_home_24)
// Badge dengan angka
                    val badge = tab.getOrCreateBadge()
                    badge.isVisible = true
                    badge.number = 5
                }
                2 -> {
                    tab.text = "Tab c"
// Tambah ikon
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.outline_add_home_24)
// Badge dengan angka
                    val badge = tab.getOrCreateBadge()
                    badge.isVisible = true
                    badge.number = 5
                }
            }
        }.attach()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}