package com.mobjoy.everviewinmaterial3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobjoy.everviewinmaterial3.databinding.ItemListBinding


class imageAdapter(var imageList: List<imageRes?>?) :
    RecyclerView.Adapter<imageAdapter.MyViewHolder>() {

    class MyViewHolder(val viewBinding: ItemListBinding) : RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(item)

    }

    override fun getItemCount(): Int = imageList?.size ?: 0

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageId = imageList?.get(position)
        holder.viewBinding.carouselImageView.setImageResource(imageId!!.imageId)
    }

}