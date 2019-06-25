package com.application.zomato.starter.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.application.zomato.starter.R
import com.application.zomato.starter.data.restaurant
import java.util.ArrayList

class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    /**
     * Change the type of data in list to support your data
     */
    var items : List<restaurant> = ArrayList();

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        /**
         * change R.id.layout_item_basic to your layout id
         */
        Log.v("testing","OnCreateHolder")
        val view = LayoutInflater.from(p0.context).inflate(R.layout.activity2_basic,p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.v("testing","OnBindViewHolder")
        holder.bindData(items[position])
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        init{
            view.setOnClickListener {
                Toast.makeText(it?.context,restaurant?.Name, Toast.LENGTH_SHORT).show()
            }
        }

        //private val textView : TextView = view.findViewById(R.id.text1)
        private val nameview : TextView = view.findViewById(R.id.Name)
        private val addressview : TextView = view.findViewById(R.id.Address)
        private val descriptionview : TextView = view.findViewById(R.id.Description)
        var restaurant : restaurant?=null

        fun bindData(r : restaurant) {
            /**
             * use data and set on the view
             */
            //textView.text = s
            restaurant=r
            nameview.text=r.Name;
            addressview.text=r.Address
            descriptionview.text=r.description
        }

    }
}
