package com.example.userprofileregistration.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.userprofileregistration.R


class WelcomeActivity : AppCompatActivity() {
    private lateinit var listButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {

            val intent = Intent(this, LodingActivity::class.java)
            intent.putExtra("TARGET_ACTIVITY", "com.example.userprofileregistration.View.ProfileListActivity")
            startActivity(intent)
            finish()
        }
    }
}