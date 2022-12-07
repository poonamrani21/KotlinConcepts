package com.kotlinconcepts.helper

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.TextView

object  LauncherUtil {

    // launchActivity function will open new activity with Intent
    fun Context.launchActivity(activityContext: Activity, activityClass: Class<*>) {
        val intent = Intent(activityContext, activityClass)
        startActivity(intent)
    }

    // setClassName function will set the class name on textview over called activity
   fun setClassName(activityContext: Activity,textView:TextView){
      // textView.text= activityContext::class.java.name
       textView.text= activityContext::class.simpleName
   }

}