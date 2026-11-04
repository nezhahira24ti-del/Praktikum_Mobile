package com.example.nezhahira_3tic.message

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nezhahira_3tic.R
import com.example.nezhahira_3tic.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!
    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://i.pravatar.cc/150?img=1"),
        MessageModel("Budi", "Sudah makan?", "https://i.pravatar.cc/150?img=2"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://i.pravatar.cc/150?img=3"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://i.pravatar.cc/150?img=4"),
        MessageModel("Eka", "Nice job kemarin!", "https://i.pravatar.cc/150?img=5"),
        MessageModel("Fajar", "Lagi ngapain?", "https://i.pravatar.cc/150?img=6"),
        MessageModel("Gita", "Boleh minta tolong?", "https://i.pravatar.cc/150?img=7"),
        MessageModel("Hana", "Lihat email ya", "https://i.pravatar.cc/150?img=8"),
        MessageModel("Irfan", "Oke noted", "https://i.pravatar.cc/150?img=9"),
        MessageModel("Joko", "Sampai jumpa besok", "https://i.pravatar.cc/150?img=10")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.title = "Halaman message"

        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_tutorial -> {
                    val intent = Intent(requireContext(), TutorialMessageActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItems.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
