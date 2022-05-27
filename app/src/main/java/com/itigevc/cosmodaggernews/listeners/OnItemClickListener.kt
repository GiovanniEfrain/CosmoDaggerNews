package com.itigevc.cosmodaggernews.listeners

import com.itigevc.cosmodaggernews.data.model.Article

interface OnItemClickListener {
    fun onItemClick(item: Article?)
}