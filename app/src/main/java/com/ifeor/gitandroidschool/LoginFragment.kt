package com.ifeor.gitandroidschool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        activity_second_fragment_login_button.setOnClickListener {
            activity_second_fragment_login_edittext_login.visibility = View.INVISIBLE
            activity_second_fragment_login_edittext_password.visibility = View.INVISIBLE
            activity_second_fragment_login_button.visibility = View.INVISIBLE
            activity_second_fragment_login_progressBar.visibility = View.VISIBLE
        }
    }
}
