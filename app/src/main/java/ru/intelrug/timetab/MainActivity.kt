package ru.intelrug.timetab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import ru.intelrug.timetab.data.network.TimeTabNetwork
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Navigation
         */
        val navController = findNavController(R.id.nav_host_fragment)
        findViewById<BottomNavigationView>(R.id.bottom_navigation)
            .setupWithNavController(navController)

        // Setting ActionBar
        val appBarConfiguration = AppBarConfiguration
            .Builder(
                R.id.todayFragment,
                R.id.firstWeekFragment,
                R.id.secondWeekFragment,
                R.id.settingsFragment)
            .build()
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

    }
}
