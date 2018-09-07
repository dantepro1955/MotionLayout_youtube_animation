package io.armcha.youtubeanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(private val clickListener: View.OnClickListener) : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_videos_item_view, parent, false))
        holder.itemView.setOnClickListener(clickListener)
        return holder
    }

    override fun getItemCount(): Int = 50

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}

