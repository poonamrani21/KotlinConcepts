package com.kotlinconcepts.launch_modes.standard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlinconcepts.R
import com.kotlinconcepts.helper.LauncherUtil.launchActivity
import com.kotlinconcepts.helper.LauncherUtil.setClassName
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    companion object{ private var instanceCounter = 0 }
    private var currentInstanceValue = 0
    private val TAG: String = ActivityB::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        instanceCounter++
        currentInstanceValue = instanceCounter
        setClassName(this,tv_className)
        btn_click.setOnClickListener {launchActivity(this, ActivityC::class.java)}
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Instances: $currentInstanceValue");
    }
}