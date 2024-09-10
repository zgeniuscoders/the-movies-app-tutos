package cd.zgeniuscoders.themoviesapptutos

import android.app.Application
import cd.zgeniuscoders.themoviesapptutos.movies.di.movieModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(applicationContext)
            modules(
                movieModule
            )
        }
    }
}