package com.itigevc.cosmodaggernews.ui.newsList

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.itigevc.cosmodaggernews.data.model.Article
import com.itigevc.cosmodaggernews.data.model.NewsResponse
import com.itigevc.cosmodaggernews.data.repository.NewsRepository
import com.itigevc.cosmodaggernews.data.util.Resource

import com.itigevc.cosmodaggernews.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * View Model for [NewsFragment]
 */
class NewsViewModel @Inject constructor(private val repository: NewsRepository) : BaseViewModel() {

    val newsResponse = MutableLiveData<Resource<NewsResponse>>()
    val bookmarkedResponse = MutableLiveData<Resource<List<Article>>>()

    fun getAllTopHeadLines() {

        viewModelScope.launch {

            newsResponse.value = Resource.loading(null)

            try {
                val data = repository.getAllTopHeadLines()
                newsResponse.value = Resource.success(data)
            }
            catch (error: Exception) {
                newsResponse.value = Resource.error(
                    error.message ?: "An error has occurred !",
                    null)
            }
        }
    }

    fun getAllBookmarkedArticles() {

        viewModelScope.launch(Dispatchers.IO) {

            bookmarkedResponse.postValue( Resource.loading(null) )

            try {
                val data = repository.getAllBookmarkedArticles()

                bookmarkedResponse.postValue( Resource.success(data) )
            }
            catch (error: Exception) {
                bookmarkedResponse.postValue( Resource.error(
                    error.message ?: "An error has occurred !",
                    null) )
            }
        }
    }

    fun deleteBookmarkedArticle(article: Article) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteBookmarkedArticle(article)
        }
    }

}