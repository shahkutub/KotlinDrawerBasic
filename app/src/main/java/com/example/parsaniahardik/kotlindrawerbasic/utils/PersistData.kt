package com.example.parsaniahardik.kotlindrawerbasic.utils

import android.content.Context

public class PersistData {



    companion object {
        private val PREFS_FILE_NAME = "AppPreferences"

        fun getStringData(ctx: Context, key:String):String {
            return ctx.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
                    .getString(key, "")
        }
        fun setStringData(ctx: Context, key:String,
                          data:String) {
            val prefs = ctx.getSharedPreferences(
                    PREFS_FILE_NAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString(key, data)
            editor.commit()
        }

        fun getIntData(ctx:Context, key:String):Int {
            return ctx.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
                    .getInt(key, -1)
        }
        fun setIntData(ctx:Context, key:String,
                       value:Int) {
            val prefs = ctx.getSharedPreferences(
                    PREFS_FILE_NAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putInt(key, value)
            editor.commit()
        }

        fun getBooleanData(ctx:Context, key:String):Boolean {
            return ctx.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
                    .getBoolean(key, false)
        }
        fun setBooleanData(ctx:Context, key:String,
                           data:Boolean) {
            val prefs = ctx.getSharedPreferences(
                    PREFS_FILE_NAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putBoolean(key, data)
            editor.commit()
        }

        fun getFloatData(ctx:Context, key:String):Float {
            return ctx.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
                    .getFloat(key, 0.0f)
        }
        fun setFloatData(ctx:Context, key:String,
                         value:Float) {
            val prefs = ctx.getSharedPreferences(
                    PREFS_FILE_NAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putFloat(key, value)
            editor.commit()
        }


        fun getLongData(ctx:Context, key:String):Long {
            return ctx.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
                    .getLong(key, -1)
        }
        fun setLongData(ctx:Context, key:String,
                        value:Long) {
            val prefs = ctx.getSharedPreferences(
                    PREFS_FILE_NAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putLong(key, value)
            editor.commit()
        }

    }



}