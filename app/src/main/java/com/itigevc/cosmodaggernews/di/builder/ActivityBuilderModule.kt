package com.itigevc.cosmodaggernews.di.builder

import com.itigevc.cosmodaggernews.ui.MainActivity
import dagger.Module

/*
 * The module which provides the android injection service to Activities.
 */
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

}