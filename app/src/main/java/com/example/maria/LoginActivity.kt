package com.example.maria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maria.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding =ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Tombol untuk pindah ke halaman Home
        binding.btnLogin.setOnClickListener {
            val intentKeHome = Intent(this, MainActivity::class.java)
            startActivity(intentKeHome)
        }

        // TextView untuk pindah ke halaman Register
        binding.linkKeRegister.setOnClickListener {
            val intentKeRegister = Intent(this, RegisterActivity::class.java)
            startActivity(intentKeRegister)
        }

        // TextView untuk pindah ke halaman Lupa Password
        binding.linkKeLupaPassword.setOnClickListener {
            val intentKeLupaPassword = Intent(this, LupaPasswordActivity::class.java)
            startActivity(intentKeLupaPassword)
        }
    }
}