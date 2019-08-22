package com.stevechulsdev.sclog

import android.util.Log


/**
 * 전달 인자 Boolean 타입을 통해서
 * log가 보이고 안보이도록 해준다.
 */
object ScLog {
    private const val TAG_D: String = "ScLog_Debug"
    private const val TAG_E: String = "ScLog_Error"
    private const val TAG_W: String = "ScLog_Warring"
    private const val TAG_I: String = "ScLog_Info"

    /**
     * Debug Type Log
     * @param showLog true - 로그 보임, false - 로그 안보임
     * @param debugMsg 로그 메시지
     */
    fun d(showLog: Boolean, debugMsg: String) {
        if(showLog) Log.d(TAG_D, debugMsg)
        else return
    }

    /**
     * Error Type Log
     * @param showLog true - 로그 보임, false - 로그 안보임
     * @param errorMsg 로그 메시지
     */
    fun e(showLog: Boolean, errorMsg: String) {
        if(showLog) Log.e(TAG_E, errorMsg)
        else return
    }

    /**
     * Warning Type Log
     * @param showLog true - 로그 보임, false - 로그 안보임
     * @param warningMsg 로그 메시지
     */
    fun w(showLog: Boolean, warningMsg: String) {
        if(showLog) Log.w(TAG_W, warningMsg)
        else return
    }

    /**
     * Info Type Log
     * @param showLog true - 로그 보임, false - 로그 안보임
     * @param infoMsg 로그 메시지
     */
    fun i(showLog: Boolean, infoMsg: String) {
        if(showLog) Log.i(TAG_I, infoMsg)
        else return
    }
}