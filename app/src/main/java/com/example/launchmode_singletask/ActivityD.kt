package com.example.launchmode_singletask

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        val button =findViewById<Button>(R.id.buttonD)
        button.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("In D","onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("In D","onDestroy")
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.e("In D","onCreateView")
        return super.onCreateView(name, context, attrs)

    }
    override fun onPause() {
        super.onPause()
        Log.e("In D","OnPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("In D","onResume")
    }

}