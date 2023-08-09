package com.example.familysafety

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class MemberAdapter(listMembers: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {
    class ViewHolder(private val item: View) :RecyclerView.ViewHolder(item) {
        val imageuser=item.findViewById<ImageView>(R.id.img_user)
        val nameuser=item.findViewById<TextView>(R.id.tittle)



    }




}