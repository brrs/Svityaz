package com.reproxy0.svityaz.ui.lists.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_booking.view.*

class ItemBookingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvDate: TextView = view.itemBooking_tv_date
    val tvPeopleNumber: TextView = view.itemBooking_tv_peopleNumber
}