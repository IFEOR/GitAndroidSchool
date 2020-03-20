package com.ifeor.gitandroidschool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_login, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity_second_fragment_login_button.setOnClickListener { onLoginClick() }
    }

    private fun onLoginClick() {
        if (loginValidation()) {
            changeVisibility(ScreenState.LOADING)
            // Sleep IO coroutine
            CoroutineScope(Dispatchers.Main).launch {
                withContext(Dispatchers.IO) {
                    delay(TimeUnit.SECONDS.toMillis(3))
                }
                try {
                    (activity as FragmentsActivity).createFragment(PostsFragment())
                } catch (e: Exception) {
                    changeVisibility(ScreenState.CONTENT)
                }
            }
        }
    }

    private fun loginValidation(): Boolean {
        var isNotError = true
        if (activity_second_fragment_login_edittext_login.text.isEmpty()) {
            activity_second_fragment_login_edittext_login.error = "Сan not be empty"
            isNotError = false
        }
        if (activity_second_fragment_login_edittext_password.text.length < 8) {
            activity_second_fragment_login_edittext_password.error = "Minimum 8 characters"
            isNotError = false
        }
        if (isNotError)
            return true
        return false
    }

    private fun changeVisibility(state: ScreenState) {
        activity_second_fragment_login_container_content.setVisible(state == ScreenState.CONTENT)
        activity_second_fragment_login_container_loading.setVisible(state == ScreenState.LOADING)
    }

    enum class ScreenState {
        LOADING, CONTENT
    }
}
