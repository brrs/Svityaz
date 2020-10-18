package com.reproxy0.svityaz.ui.base

import androidx.fragment.app.Fragment
import com.reproxy0.svityaz.MainActivity

open class BaseFragment : Fragment() {

    fun hideActionBar() {
        (activity as MainActivity).supportActionBar?.hide()
    }

    fun showActionBar() {
        (activity as MainActivity).supportActionBar?.show()
    }

}