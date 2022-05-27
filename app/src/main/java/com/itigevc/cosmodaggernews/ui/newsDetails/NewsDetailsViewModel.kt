package com.itigevc.cosmodaggernews.ui.newsDetails

import androidx.lifecycle.viewModelScope
import com.itigevc.cosmodaggernews.data.model.Article
import com.itigevc.cosmodaggernews.data.repository.NewsRepository
import com.itigevc.cosmodaggernews.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * View Model for [[NewsDetailsFragment]]
 */
class NewsDetailsViewModel @Inject constructor(private val repository: NewsRepository) :
    BaseViewModel() {

    fun bookmarkArticle(article: Article) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.bookmarkArticle(article)
        }
    }

    fun removeBookmarkArticle(article: Article) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.removeBookmarkedArticle(article)
        }
    }

}