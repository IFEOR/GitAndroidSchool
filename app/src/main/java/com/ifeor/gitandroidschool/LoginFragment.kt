package com.ifeor.gitandroidschool

import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.Runnable as Runnable1

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity_second_fragment_login_button.setOnClickListener {
            activity_second_fragment_login_edittext_login.visibility = View.INVISIBLE
            activity_second_fragment_login_edittext_password.visibility = View.INVISIBLE
            activity_second_fragment_login_button.visibility = View.INVISIBLE
            activity_second_fragment_login_progressBar.visibility = View.VISIBLE

            CoroutineScope(Dispatchers.Main).launch {
                withContext(Dispatchers.IO) {
                    delay(TimeUnit.SECONDS.toMillis(3))
                }
                activity_second_fragment_login_edittext_login.visibility = View.VISIBLE
                activity_second_fragment_login_edittext_password.visibility = View.VISIBLE
                activity_second_fragment_login_button.visibility = View.VISIBLE
                activity_second_fragment_login_progressBar.visibility = View.INVISIBLE
            }
        }
    }
}
