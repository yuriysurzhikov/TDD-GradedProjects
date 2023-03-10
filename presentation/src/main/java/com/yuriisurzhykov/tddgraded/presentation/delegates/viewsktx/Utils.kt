package com.yuriisurzhykov.tddgraded.presentation.delegates.viewsktx

import android.os.Looper

fun checkMainThread() {
    check(Looper.getMainLooper() === Looper.myLooper()) {
        "The method must be called on the main thread"
    }
}