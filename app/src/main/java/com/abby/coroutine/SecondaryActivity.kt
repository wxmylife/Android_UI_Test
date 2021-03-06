package com.abby.coroutine

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_secondary)

    findViewById<Button>(R.id.button_back).setOnClickListener {
      finish()
    }

  }
}
