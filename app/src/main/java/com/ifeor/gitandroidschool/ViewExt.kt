package com.ifeor.gitandroidschool

import android.view.View

fun View.setVisible(visible: Boolean) {
    if (visible)
        visibility = View.VISIBLE
    else
        visibility = View.GONE
}

enum class ScreenState {
    LOADING, CONTENT
}
