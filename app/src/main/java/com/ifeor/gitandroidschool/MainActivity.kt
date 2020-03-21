package com.ifeor.gitandroidschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        activity_first_button_to_second_screen.setOnClickListener { onSecondScreenClick() }
    }

    private fun onSecondScreenClick() {
        val intent = Intent(this, FragmentsActivity::class.java)
        // Data transferring
        val sendingText = activity_first_text_fishtext.text
        intent.putExtra(FragmentsActivity.FIRST_ACTIVITY_TEXT, sendingText)
        startActivity(intent)
    }
}
