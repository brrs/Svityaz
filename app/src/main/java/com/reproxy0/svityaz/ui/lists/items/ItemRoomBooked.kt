package com.reproxy0.svityaz.ui.lists.items

import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.lists.IBaseListItem

open class ItemRoomBooked(
    val number: Int,
    val bookings: Map<String, Int>
) : IBaseListItem {
    override val layoutId = R.layout.item_booked_room
}