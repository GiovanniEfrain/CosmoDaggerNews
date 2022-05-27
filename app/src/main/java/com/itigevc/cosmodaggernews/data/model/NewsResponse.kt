package com.itigevc.cosmodaggernews.data.model

data class NewsResponse (
 var status : String? = null,
 var totalResults : Int? = null,
 var articles : ArrayList<Article> = arrayListOf()
)