package com.reproxy0.svityaz.ui.lists.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.lists.SimpleListAdapter
import com.reproxy0.svityaz.ui.lists.items.ItemBooking
import com.reproxy0.svityaz.ui.lists.viewholders.ItemBookingViewHolder

class BookingListAdapter : SimpleListAdapter() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            R.layout.item_booking -> ItemBookingViewHolder(
                inflateByViewType(
                    parent.context,
                    viewType,
                    parent
                )
            )

            else -> throw IllegalStateException("There is no match with current layoutId")
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = when (holder) {
        is ItemBookingViewHolder -> {
            val item = items[position] as ItemBooking
            holder.tvDate.text = item.date
            holder.tvPeopleNumber.text = item.peopleNumber.toString()
        }

        else -> throw IllegalStateException("There is no match with current layoutId")
    }

}