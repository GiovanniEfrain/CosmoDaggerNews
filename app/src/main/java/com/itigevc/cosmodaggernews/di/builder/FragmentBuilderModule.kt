package com.itigevc.cosmodaggernews.di.builder

import com.itigevc.cosmodaggernews.ui.bookmarked.BookmarkedFragment
import com.itigevc.cosmodaggernews.ui.newsDetails.NewsDetailsFragment
import com.itigevc.cosmodaggernews.ui.newsList.NewsFragment
import com.itigevc.cosmodaggernews.ui.newsList.NewsListModule
import dagger.Module

/*
 * This builder provides android injector service to fragments
 */
@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [NewsListModule::class])
    abstract fun bindNewsFragment(): NewsFragment

    @ContributesAndroidInjector
    abstract fun bindNewsDetailsFragment(): NewsDetailsFragment

    @ContributesAndroidInjector(modules = [NewsListModule::class])
    abstract fun bindBookmarkedFragment(): BookmarkedFragment

}