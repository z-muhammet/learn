package com.example.greek_mythology_book

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.greek_mythology_book.recyclerAdapter.*
class singletonclass() {
    companion object selectGodImage {
        var selectedImage: Bitmap? = null
    }
}
class recyclerAdapter(val godsArrayList: ArrayList<String>, val godsBitmapList: ArrayList<Bitmap>,context: Context) :
    RecyclerView.Adapter<recyclerViewHolder>() {

    val _context = context
    class recyclerViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
        val itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_items, parent, false)
        return recyclerViewHolder(itemview)
    }


    override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.godsName).text = godsArrayList[position]
        holder.itemView.findViewById<TextView>(R.id.godsName).setOnClickListener {
            val intent = Intent(_context, book_page::class.java)
            intent.putExtra("godName",godsArrayList[position])
            val selectedGod = singletonclass.selectGodImage
            selectedGod.selectedImage = godsBitmapList[position]
            _context.startActivity(intent)

        }
        holder.itemView.findViewById<ImageView>(R.id.godsImage).setImageBitmap(godsBitmapList[position])
        val intent = Intent(_context,book_page::class.java)

    }

    override fun getItemCount(): Int {
        return godsArrayList.size
    }
}