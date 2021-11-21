package com.example.motivador.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    private val mSharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String){
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String {
       return mSharedPreferences.getString(key, "") ?: ""
    }

    fun storeInt(key: String, value: Int){
        mSharedPreferences.edit().putInt(key, value).apply()
    }
}