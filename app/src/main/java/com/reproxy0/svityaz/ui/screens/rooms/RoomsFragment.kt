package com.reproxy0.svityaz.ui.screens.rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.base.BaseFragment
import com.reproxy0.svityaz.ui.lists.adapters.RoomsListAdapter
import com.reproxy0.svityaz.ui.lists.items.ItemRoomAvailable
import com.reproxy0.svityaz.ui.lists.items.ItemRoomBooked
import com.reproxy0.svityaz.ui.lists.items.ItemRoomRented
import kotlinx.android.synthetic.main.rooms_fragment.view.*

class RoomsFragment : BaseFragment() {
    private lateinit var viewModel: RoomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.rooms_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRoomList(view)
    }

    private fun setupRoomList(view: View) {
        view.roomsFragment_rv_rooms.layoutManager = LinearLayoutManager(context)
        val adapter = RoomsListAdapter()
        view.roomsFragment_rv_rooms.adapter = adapter

        adapter.add(
            ItemRoomRented(
                1,
                mapOf(
                    "Until the May 26" to 2,
                    "June 2 - June 5" to 3,
                    "June 5 - June 6" to 4,
                    "June 6 - June 10" to 4,
                )
            )
        )

        adapter.add(
            ItemRoomAvailable(
                2,
            )
        )

        adapter.add(
            ItemRoomBooked(
                3,
                mapOf(
                    "June 2 - June 5" to 3,
                    "June 7 - June 10" to 3,
                    "June 12 - June 15" to 3,
                )
            )
        )

        adapter.add(
            ItemRoomBooked(
                4,
                mapOf(
                    "June 3 - June 4" to 4,
                    "June 4 - June 7" to 2,
                )
            )
        )

        adapter.add(
            ItemRoomAvailable(
                5,
            )
        )

        adapter.add(
            ItemRoomRented(
                6,
                mapOf(
                    "Until the May 24" to 4,
                )
            )
        )

        adapter.add(
            ItemRoomAvailable(
                7,
            )
        )

        adapter.add(
            ItemRoomAvailable(
                8,
            )
        )

        adapter.add(
            ItemRoomRented(
                9,
                mapOf(
                    "Until the May 24" to 2,
                )
            )
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RoomsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onResume() {
        hideActionBar()
        super.onResume()
    }
}