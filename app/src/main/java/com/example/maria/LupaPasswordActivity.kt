package com.example.maria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maria.databinding.ActivityLoginBinding
import com.example.maria.databinding.ActivityLupaPasswordBinding

class LupaPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLupaPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLupaPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // TextView untuk pindah ke halaman Login
        binding.linkKeLogin.setOnClickListener {
            val intentKeLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentKeLogin)
        }
    }
}