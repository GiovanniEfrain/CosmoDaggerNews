package com.itigevc.cosmodaggernews.ui.newsList

import com.itigevc.cosmodaggernews.ui.newsList.NewsAdapter
import dagger.Module
import dagger.Provides

@Module
class NewsListModule {

    @Provides
    internal fun provideNewsAdapter(): NewsAdapter = NewsAdapter()

}