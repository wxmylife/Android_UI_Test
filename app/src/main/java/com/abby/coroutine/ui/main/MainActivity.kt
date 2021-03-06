package com.abby.coroutine.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.abby.coroutine.R
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.button_next_activity).setOnClickListener {
      val intent = Intent(this, SecondaryActivity::class.java)
      startActivity(intent)
    }
  }


}