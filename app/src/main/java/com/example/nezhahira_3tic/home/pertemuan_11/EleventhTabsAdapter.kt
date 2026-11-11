package com.example.nezhahira_3tic.home.pertemuan_11

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class EleventhTabsAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    // Jumlah total tab yang ada
    override fun getItemCount(): Int = 3

    // Menentukan Fragment yang ditampilkan berdasarkan posisi tab
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabAFragment()
            1 -> TabBFragment()
            2 -> TabCFragment()
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}
