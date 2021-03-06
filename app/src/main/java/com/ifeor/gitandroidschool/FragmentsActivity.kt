package com.ifeor.gitandroidschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class FragmentsActivity : AppCompatActivity() {

    companion object {
        const val FIRST_ACTIVITY_TEXT = "Fishtext"
    }

    var actualFragment: Fragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()
        createFragment(actualFragment)
    }

    fun createFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.activity_second_fragment_container, fragment)
        transaction.commit()
    }

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    fun getFishtext(): String = intent.getStringExtra(FIRST_ACTIVITY_TEXT)
}
