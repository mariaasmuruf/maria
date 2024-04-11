package com.example.maria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var wisataRecyclerView: RecyclerView
//    private lateinit var wisataAdapter: MyAdapter
    private lateinit var listWisata: ArrayList<ItemData>

    private lateinit var nama: Array <String>
    private lateinit var gambar: Array <Int>
    private lateinit var lokasi: Array <String>
    private lateinit var deskripsi: Array <String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        gambar = arrayOf(
            R.drawable.bukit_jokowi,
            R.drawable.bukit_teletabis,
            R.drawable.jayapura_city,
            R.drawable.wisata_jembatan_merah,
            R.drawable.kali_biru,
            R.drawable.wisata_mangrove,
            R.drawable.wisata_kampung_yoboi,
            R.drawable.pantai_base_g,
            R.drawable.skow,
            R.drawable.wisata_jembatan_merah
        )

        nama = arrayOf(
            "bukit_jokowi",
            "bukit_teletabis",
            "jayapura_city",
            "wisata_jembatan_merah",
            "kali_biru",
            "wisata_mangrove",
            "wisata_kampung_yoboi",
            "skow",
            "skow",
            "wisata_jembatan_merah"
        )

        lokasi = arrayOf(
            "skayel",
            "kab_jayapura",
            "kota_jayapura",
            "kota_jayapura",
            "kab_jayapura",
            "kota_jayapura",
            "kab_jayapura",
            "kota_jayapura",
            "perbatasan_png",
            "kota_jayapura"
        )

        deskripsi = arrayOf(
            getString(R.string.pantai_base_g),
            getString(R.string.pantai_hamadi),
            getString(R.string.wisata_mangrove),
            getString(R.string.skow),
            getString(R.string.kali_biru),
            getString(R.string.wisata_kampung_yoboi),
            getString(R.string.wisata_jembatan_merah),
            getString(R.string.bukit_teletabis),
            getString(R.string.bukit_jokowi),
            getString(R.string.jayapura_city),

            )

        wisataRecyclerView = findViewById(R.id.wisataRV)
        wisataRecyclerView.layoutManager = LinearLayoutManager(this)
        wisataRecyclerView.setHasFixedSize(true)

        listWisata = arrayListOf<ItemData>()
        getDataUser()

    }

    private fun getDataUser() {
        for (i in gambar.indices){
            val datawisata = ItemData(gambar[i],nama[i],lokasi[i])
            listWisata.add(datawisata)
        }


    val adapter = MyAdapter(listWisata)
        wisataRecyclerView.adapter = adapter
        adapter.set0nItemClickckListener(object:MyAdapter.onItemClickLickListener{

            override fun onItemClik(position: Int) {
                intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idGambar",listWisata[position].gambar)
                intent.putExtra("idNama",listWisata[position].nama)
                intent.putExtra("idLokasi",listWisata[position].lokasi)
                intent.putExtra("idDeskripsi",deskripsi[position])

                startActivity(intent)
            }

        })
    }

}
