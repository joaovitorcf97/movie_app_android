package com.joao.movieapp.core.util

import com.joao.movieapp.BuildConfig

fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

fun String?.toBackgroundUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"