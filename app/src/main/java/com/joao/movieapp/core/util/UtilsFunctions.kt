package com.joao.movieapp.core.util

import timber.log.Timber

class UtilsFunctions {
    fun logError(tag: String, message: String) {
        Timber.tag(tag).e("Error -> $message")
    }

    fun logInfo(tag: String, message: String) {
        Timber.tag(tag).i("Info -> $message")
    }
}