package com.stevechulsdev.sclog

import android.util.Log



object ScLog {
    private const val TAG_D: String = "ScLog_Debug"
    private const val TAG_E: String = "ScLog_Error"
    private const val TAG_W: String = "ScLog_Warring"
    private const val TAG_I: String = "ScLog_Info"

    fun d(showLog: Boolean, debugMsg: String) {
        if(showLog) Log.d(TAG_D, debugMsg)
        else return
    }

    fun e(showLog: Boolean, errorMsg: String) {
        if(showLog) Log.e(TAG_E, errorMsg)
        else return
    }

    fun w(showLog: Boolean, warningMsg: String) {
        if(showLog) Log.w(TAG_W, warningMsg)
        else return
    }

    fun i(showLog: Boolean, infoMsg: String) {
        if(showLog) Log.i(TAG_I, infoMsg)
        else return
    }
}