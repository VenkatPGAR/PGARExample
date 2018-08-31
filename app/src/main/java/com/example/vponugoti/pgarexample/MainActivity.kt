package com.example.vponugoti.pgarexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.e("ON Resume","method added")

        Log.e("B1 branch created","created local branch 1")

        Log.e("LFRB2 branch ","created local branch copy from remote branch PgarExampleB1")
    }
}

