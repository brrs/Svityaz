package com.reproxy0.svityaz.ui.lists.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_booked_room.view.*

class ItemRoomBookedViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvRoomNumber: TextView = view.itemBookedRoom_tv_roomNumber
    val rvBookingList: RecyclerView = view.itemBookedRoom_rv_bookingList
}