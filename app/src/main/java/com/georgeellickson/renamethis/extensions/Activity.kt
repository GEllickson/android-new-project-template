package com.georgeellickson.renamethis.extensions

import android.app.Activity

fun Activity.hideKeyboard() {
    currentFocus?.hideKeyboard()
}

fun Activity.clearFocus() {
    currentFocus?.clearFocus()
}

fun Activity.hideKeyboardAndFocus() {
    hideKeyboard()
    clearFocus()
}
