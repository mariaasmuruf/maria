package com.example.maria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var wisataRecyclerView: RecyclerView
    private lateinit var wisataAdapter: MyAdapter
    private lateinit var listWisata: ArrayList<ItemData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        wisataRecyclerView = findViewById(R.id.wisataRV)
        listWisata = ArrayList()

        listWisata.add(ItemData(R.drawable.pantai_base_g,"Pantai_Base_g","Kota_jayapura_papua"))
        listWisata.add(ItemData(R.drawable.bukit_jokowi, "Bukit_jokowi","skaylen"))
        listWisata.add(ItemData(R.drawable.jayapura_city,"Jayapura_city","Kota_jayapura"))
        listWisata.add(ItemData(R.drawable.bukit_teletabis,"Bukit_teletabis","Kab_jayapura"))
        listWisata.add(ItemData(R.drawable.wisata_kampung_yoboi,"Wisata_kampung_yoboi","Kab_Jayapura"))
        listWisata.add(ItemData(R.drawable.pantai_hamadi,"Pantai_hamadi","Kota_jayapura"))
        listWisata.add(ItemData(R.drawable.wisata_mangrove,"Wisata_mangrove,","Kota_jayapura"))
        listWisata.add(ItemData(R.drawable.wisata_jembatan_merah,"Wisata_jembatan_merah","Kota_jayapura"))
        listWisata.add(ItemData(R.drawable.kali_biru,"Kali_biru","Kota_jayapura"))
        listWisata.add(ItemData(R.drawable.skow,"Skow,","Perbatasan_png"))


        wisataRecyclerView.layoutManager=LinearLayoutManager(this)
        wisataRecyclerView.setHasFixedSize(true)
        wisataAdapter = MyAdapter(listWisata)
        wisataRecyclerView.adapter = wisataAdapter

    }
}