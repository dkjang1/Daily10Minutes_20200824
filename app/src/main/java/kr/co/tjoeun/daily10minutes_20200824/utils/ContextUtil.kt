package kr.co.tjoeun.daily10minutes_20200824.utils

import android.content.Context

//23
class ContextUtil {

    companion object {

        //23-1:setter,getter
        private val prefName = "Daily10MinutesPref"
        private val AUTO_LOGIN_CHECK = "AUTO_LOGIN_CHECK"
        fun setAutoLoginCheck(context: Context, isAuto: Boolean) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN_CHECK, isAuto).apply()
        }

        fun getAutoLoginCheck(context: Context): Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(AUTO_LOGIN_CHECK, false)
        }

    }

}