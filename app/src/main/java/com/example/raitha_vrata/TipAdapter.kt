package com.example.raitha_vrata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val tipList: List<Tip>) :
    RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgCrop: ImageView =
            itemView.findViewById(R.id.imgCrop)

        val txtCropName: TextView =
            itemView.findViewById(R.id.txtCropName)

        val txtCropTip: TextView =
            itemView.findViewById(R.id.txtCropTip)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tip_card, parent, false)

        return TipViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: TipViewHolder,
        position: Int
    ) {

        val tip = tipList[position]

        holder.imgCrop.setImageResource(tip.image)

        holder.txtCropName.text = tip.title

        holder.txtCropTip.text = tip.description
    }

    override fun getItemCount(): Int {
        return tipList.size
    }
}