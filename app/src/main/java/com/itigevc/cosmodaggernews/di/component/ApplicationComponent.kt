package com.itigevc.cosmodaggernews.di.component

import android.app.Application
import com.itigevc.cosmodaggernews.NewsApplication
import com.itigevc.cosmodaggernews.di.builder.ActivityBuilderModule
import com.itigevc.cosmodaggernews.di.builder.FragmentBuilderModule
import com.itigevc.cosmodaggernews.di.module.AppModule
import com.itigevc.cosmodaggernews.di.module.viewmodel.ViewModelModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuilderModule::class,
    FragmentBuilderModule::class,
    ViewModelModule::class
])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: NewsApplication)
}