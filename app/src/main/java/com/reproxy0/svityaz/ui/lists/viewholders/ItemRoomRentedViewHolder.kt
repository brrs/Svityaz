package com.reproxy0.svityaz.ui.lists.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rented_room.view.*

class ItemRoomRentedViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvRoomNumber: TextView = view.itemRentedRoom_tv_roomNumber
    val rvBookingList: RecyclerView = view.itemRentedRoom_rv_bookingList
}