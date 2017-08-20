package com.liutao.demo.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.liutao.demo.R
import kotlinx.android.synthetic.main.item_image.view.*

/**
 * Created by liutao on 2017/8/20.
 */
class ImageAdapter(var data: List<String>, var context: Context) : RecyclerView.Adapter<ImageAdapter.MyViewHolder>() {

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        Glide.with(context).load(data[position]).into(holder?.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.iv_image
    }
}