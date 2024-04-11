package com.example.maria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maria.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        // Tombol untuk pindah ke halaman Login
        binding.btnRegister.setOnClickListener {
            val intentKeLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentKeLogin)
        }


        // TextView untuk pindah ke halaman Login
        binding.linkKeLogin.setOnClickListener {
            val intentKeLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentKeLogin)
        }
    }
}