package com.example.nezhahira_3tic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nezhahira_3tic.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnLogin.setOnClickListener {
            val user = binding.edtUsername.text.toString()
            val pass = binding.edtPassword.text.toString()

            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("nama", user.ifEmpty { "nezha" })
            intent.putExtra("umur", 25)
            startActivity(intent)

            Log.d("Username: ", user)
            Log.d("Password: ", pass)

            Toast.makeText(this, "Username: $user Password: $pass", Toast.LENGTH_LONG).show()
        }
    }
}
