package com.example.userprofileregistration.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.userprofileregistration.R
import com.example.userprofileregistration.model.UserProfile


class LodingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loding)


        Handler(Looper.getMainLooper()).postDelayed({

            val targetActivityName = intent.getStringExtra("TARGET_ACTIVITY")
            val userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile?


            val targetIntent = Intent()
            targetIntent.setClassName(this, targetActivityName ?: return@postDelayed)
            userProfile?.let {
                targetIntent.putExtra("USER_PROFILE", it)
            }
            startActivity(targetIntent)
            finish()
        }, 1000)
    }
}
