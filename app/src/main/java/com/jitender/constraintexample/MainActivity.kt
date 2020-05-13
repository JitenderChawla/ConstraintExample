package com.jitender.constraintexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.group)
        val group: Group!= findViewById<Group>(R.id.group)
        group.visibility = View.GONE
    }
}
