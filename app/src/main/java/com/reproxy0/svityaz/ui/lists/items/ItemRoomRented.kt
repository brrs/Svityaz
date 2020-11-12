package com.reproxy0.svityaz.ui.lists.items

import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.lists.IBaseListItem

class ItemRoomRented(
    val number: Int,
    val bookings: Map<String, Int>
) : IBaseListItem {
    override val layoutId = R.layout.item_rented_room
}