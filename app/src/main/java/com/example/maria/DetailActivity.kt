package com.example.maria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val gambar : ImageView = findViewById(R.id.iv_gambar)
        val nama: TextView = findViewById(R.id.tv_nama)
        val lokasi:TextView = findViewById(R.id.tv_lokasi)
        val deskripsi : TextView = findViewById(R.id.tv_des)


        val bundle: Bundle? = intent.extras
        val bNama = bundle!!.getString("idNama")
        val bGambar = bundle.getInt("idGambar")
        val bLokasi = bundle.getString("idLokasi")
        val bDeskripsi = bundle.getString("idDeskripsi")

        gambar.setImageResource(bGambar)
        nama.text = bNama
        lokasi.text =bLokasi
        deskripsi.text = bDeskripsi




    }
}