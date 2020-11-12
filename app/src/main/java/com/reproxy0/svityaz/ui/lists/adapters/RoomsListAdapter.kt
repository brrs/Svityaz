package com.reproxy0.svityaz.ui.lists.adapters

import android.graphics.drawable.Drawable
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.lists.SimpleDividerItemDecorator
import com.reproxy0.svityaz.ui.lists.SimpleListAdapter
import com.reproxy0.svityaz.ui.lists.items.ItemBooking
import com.reproxy0.svityaz.ui.lists.items.ItemRoomAvailable
import com.reproxy0.svityaz.ui.lists.items.ItemRoomBooked
import com.reproxy0.svityaz.ui.lists.items.ItemRoomRented
import com.reproxy0.svityaz.ui.lists.viewholders.ItemRoomAvailableViewHolder
import com.reproxy0.svityaz.ui.lists.viewholders.ItemRoomBookedViewHolder
import com.reproxy0.svityaz.ui.lists.viewholders.ItemRoomRentedViewHolder

class RoomsListAdapter : SimpleListAdapter() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            R.layout.item_available_room -> ItemRoomAvailableViewHolder(
                inflateByViewType(
                    parent.context,
                    viewType,
                    parent
                )
            )

            R.layout.item_booked_room -> ItemRoomBookedViewHolder(
                inflateByViewType(
                    parent.context,
                    viewType,
                    parent
                )
            )

            R.layout.item_rented_room -> ItemRoomRentedViewHolder(
                inflateByViewType(
                    parent.context,
                    viewType,
                    parent
                )
            )

            else -> throw IllegalStateException("There is no match with current layoutId")
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = when (holder) {
        is ItemRoomAvailableViewHolder -> {
            val item = items[position] as ItemRoomAvailable
            holder.tvRoomNumber.text = item.number.toString()
        }

        is ItemRoomBookedViewHolder -> {
            val item = items[position] as ItemRoomBooked
            holder.tvRoomNumber.text = item.number.toString()

            holder.rvBookingList.apply {
                setHasFixedSize(true)
                addItemDecoration(
                    SimpleDividerItemDecorator(
                        ContextCompat.getDrawable(context, R.drawable.divider_simple) as Drawable
                    )
                )
            }

            holder.rvBookingList.adapter = BookingListAdapter().apply {
                item.bookings.forEach { add(ItemBooking(it.key, it.value)) }
            }
        }

        is ItemRoomRentedViewHolder -> {
            val item = items[position] as ItemRoomRented
            holder.tvRoomNumber.text = item.number.toString()
            holder.rvBookingList.apply {
                setHasFixedSize(true)
                addItemDecoration(
                    SimpleDividerItemDecorator(
                        ContextCompat.getDrawable(context, R.drawable.divider_simple) as Drawable
                    )
                )
            }
            holder.rvBookingList.adapter = BookingListAdapter().apply {
                item.bookings.forEach { add(ItemBooking(it.key, it.value)) }
            }
        }

        else -> throw IllegalStateException("There is no match with current layoutId")
    }
}