package aveek.com.designpatterns

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class DesignPatterns : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        initRealm()
    }

    companion object {
        lateinit var instance: DesignPatterns
            private set
    }

    fun initRealm(){
        Realm.init(this)
        val config = RealmConfiguration.Builder()
                .name("student.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(config)
    }
}