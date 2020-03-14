package com.ifeor.gitandroidschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        createFragment()
    }

    private fun createFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = LoginFragment()
        transaction.replace(R.id.activity_second_fragment_login, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
