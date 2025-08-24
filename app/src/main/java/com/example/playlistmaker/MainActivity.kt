package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.search_button)
        val buttonClickListener: View.OnClickListener = object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SearchActivity::class.java)
                startActivity(intent)
            }
        }
    buttonSearch.setOnClickListener(buttonClickListener)

        val buttonLibrary = findViewById<Button>(R.id.library_button)
        buttonLibrary.setOnClickListener {
            val intent = Intent(this@MainActivity, LibraryActivity::class.java)
            startActivity(intent)
            }

        val buttonSettings = findViewById<Button>(R.id.settings_button)
        buttonSettings.setOnClickListener{
            val intent = Intent(this@MainActivity,SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}