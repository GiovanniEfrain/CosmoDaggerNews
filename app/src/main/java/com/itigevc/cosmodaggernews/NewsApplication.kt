package com.itigevc.cosmodaggernews

import android.app.Activity
import android.content.ContextWrapper
import androidx.fragment.app.Fragment
import androidx.multidex.MultiDexApplication
import com.pixplicity.easyprefs.library.Prefs
import javax.inject.Inject

class NewsApplication: MultiDexApplication(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    internal lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    @Inject
    internal lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
    override fun supportFragmentInjector(): AndroidInjector<Fragment> = supportFragmentInjector

    companion object {
        lateinit var applicationInstance: NewsApplication
    }

    override fun onCreate() {
        super.onCreate()

        initializeComponent()
        initializePreference()

    }

    private fun initializePreference() {
        // Initialize the Prefs class
        Prefs.Builder()
            .setContext(this)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(packageName)
            .setUseDefaultSharedPreference(true)
            .build()
    }

    private fun initializeComponent() {
        DaggerApplicationComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }

}