package com.reproxy0.svityaz.ui.lists

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class SimpleListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    IBaseListAdapter<IBaseListItem> {

    protected open val items: ArrayList<IBaseListItem> = ArrayList()

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = items[position].layoutId

    protected fun inflateByViewType(context: Context?, viewType: Int, parent: ViewGroup): View =
        LayoutInflater.from(context).inflate(viewType, parent, false)

    override fun add(newItem: IBaseListItem) {
        items.add(newItem)
        notifyDataSetChanged()
    }

    override fun add(newItems: ArrayList<IBaseListItem>?) {
        for (newItem in newItems ?: return) {
            items.add(newItem)
            notifyDataSetChanged()
        }
    }

    override fun addAtPosition(pos: Int, newItem: IBaseListItem) {
        items.add(pos, newItem)
        notifyDataSetChanged()
    }

    override fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

    override fun remove(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
    }

    fun replace(position: Int, newItem: IBaseListItem) {
        items.removeAt(position)
        items.add(position, newItem)
        notifyItemChanged(position)
    }
}