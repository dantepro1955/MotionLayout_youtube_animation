package io.armcha.youtubeanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleVideoDetailAdapter : RecyclerView.Adapter<SimpleVideoDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.detail_video_item_view, parent, false))
    }

    override fun getItemCount(): Int = 50

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
