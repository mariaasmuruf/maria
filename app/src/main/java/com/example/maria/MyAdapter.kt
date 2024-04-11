package com.example.maria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val namaList : ArrayList<ItemData>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    private lateinit var mListener : onItemClickLickListener

    interface onItemClickLickListener {

        fun onItemClik(position: Int)

        }

        fun set0nItemClickckListener(listener : onItemClickLickListener){
            mListener = listener
        }



    class MyViewHolder(itemData: View, listener : onItemClickLickListener) : RecyclerView.ViewHolder(itemData) {
        val gambar: ImageView = itemData.findViewById(R.id.idGambar)
        val nama: TextView = itemData.findViewById(R.id.idNama)
        val lokasi: TextView = itemData.findViewById(R.id.idLokasi)

        init {
            itemView.setOnClickListener {
                listener.onItemClik(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent, false)
        return MyViewHolder(itemData, mListener)
        }


    override fun getItemCount(): Int = namaList.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.lokasi.text = currentItem.lokasi
    }

}