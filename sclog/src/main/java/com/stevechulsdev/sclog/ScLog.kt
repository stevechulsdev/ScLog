package com.stevechulsdev.sclog

import android.util.Log

object ScLog {
    private const val TAG_D: String = "ScLog_Debug"
    private const val TAG_E: String = "ScLog_Error"
    private const val TAG_W: String = "ScLog_Warring"
    private const val TAG_I: String = "ScLog_Info"

    fun D(debugMsg: String) {
        if(BuildConfig.DEBUG) Log.d(TAG_D, debugMsg)
    }

    fun E(errorMsg: String) {
        if(BuildConfig.DEBUG) Log.e(TAG_E, errorMsg)
    }

    fun W(warningMsg: String) {
        if(BuildConfig.DEBUG) Log.w(TAG_W, warningMsg)
    }

    fun I(infoMsg: String) {
        if(BuildConfig.DEBUG) Log.i(TAG_I, infoMsg)
    }
}