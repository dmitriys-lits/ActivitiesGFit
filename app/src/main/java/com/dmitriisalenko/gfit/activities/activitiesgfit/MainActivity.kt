package com.dmitriisalenko.gfit.activities.activitiesgfit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmitriisalenko.gfit.activities.activitiesgfit.ui.main.MainFragment
import android.R.attr.data
import com.dmitriisalenko.gfit.activities.activitiesgfit.ui.main.PermissionsFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PermissionsFragment.newInstance())
                .commitNow()
        }
    }

}
