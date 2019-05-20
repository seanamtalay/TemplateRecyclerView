package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * RecyclerAdapterTEMPLATE
 * The parameter is a List that contain value needed to be shown
 */

class RecyclerAdapterTEMPLATE(val stringList: ArrayList<String>): RecyclerView.Adapter<RecyclerAdapterTEMPLATE.ViewHolderTEMPLATE>(){
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolderTEMPLATE {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderTEMPLATE(layoutInflater.inflate(R.layout.recycler_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return stringList.size

    }

    override fun onBindViewHolder(holder: ViewHolderTEMPLATE, position: Int) {
        holder.stringText.text = stringList[position]

        //TODO set up the views to match value in the list


    }

    /**
     * ViewHolder. for each row on the list
     * Can be very short, thanks to Kotlin
     */
    class ViewHolderTEMPLATE(itemView: View): RecyclerView.ViewHolder(itemView){
        internal var stringText: TextView = itemView.findViewById(R.id.recycler_text) //recycler_text in from recycler_layout

        //TODO Add more views as wish

    }


}

