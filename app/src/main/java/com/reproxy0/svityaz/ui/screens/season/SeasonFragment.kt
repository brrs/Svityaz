package com.reproxy0.svityaz.ui.screens.season

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.reproxy0.svityaz.R
import com.reproxy0.svityaz.ui.base.BaseFragment

class SeasonFragment : BaseFragment() {
    private lateinit var viewModel: SeasonViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.season_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SeasonViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onResume() {
        hideActionBar()
        super.onResume()
    }
}