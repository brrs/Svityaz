package com.reproxy0.svityaz.ui.lists.items

import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.lists.IBaseListItem

class ItemBooking(
    val date: String,
    val peopleNumber: Int
) : IBaseListItem {
    override val layoutId = R.layout.item_booking
}