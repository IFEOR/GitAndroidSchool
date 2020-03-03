package com.ifeor.gitandroidschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        activity_first_button_to_second_screen.setOnClickListener {
            val intent = Intent(this, FragmentsActivity::class.java)
            startActivity(intent)
        }
    }
}
