package com.alex.applicationmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alex.applicationmvp.mvp.TestFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestFragment().apply {
            arguments = intent.extras
            supportFragmentManager.beginTransaction().add(R.id.container, this).commit()
        }
    }
}
