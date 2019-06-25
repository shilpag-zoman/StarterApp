package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.restaurant
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */
        var list = ArrayList<restaurant>()
        list.add(restaurant("Dominos","kalkaji","pizza"))
        list.add(restaurant("Subway","nehru place","fast food"))
        list.add(restaurant())
        list.add(restaurant())
        list.add(restaurant())
        list.add(restaurant())
        list.add(restaurant())
        adapter.items = list
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}