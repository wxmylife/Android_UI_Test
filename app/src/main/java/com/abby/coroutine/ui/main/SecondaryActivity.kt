package com.abby.coroutine.ui.main

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.abby.coroutine.R

class SecondaryActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_secondary)

    findViewById<Button>(R.id.button_back).setOnClickListener {
      onBackPressed()
    }
  }

}