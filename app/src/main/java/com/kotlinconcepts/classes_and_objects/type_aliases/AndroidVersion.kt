package com.kotlinconcepts.classes_and_objects.type_aliases

import com.kotlinconcepts.R

/***
 * Type Alias Example create by [Poonam Rani] on [7-December-2022]
 */

class AndroidVersion {
    //Before Type Alias
    fun fetchAndroidVer():Triple<String, String, Int>{
        return Triple("Android 13","Tiramisu",33)
    }

    //After Type Alias
    fun fetchAndroidVersion():TripleAliases{
        return TripleAliases("Android 13","Tiramisu",33)
    }

    //Before Type Alias
    val appName1= R.string.app_name
    val drawableResourceId1= R.drawable.ic_launcher_foreground
    val drawableLayoutId1= R.layout.activity_main

    //After Type Alias
    val appName= StringResource.app_name
    val drawableResourceId= Drawable.ic_launcher_foreground
    val drawableLayoutId= Layout.activity_main
}

fun main() {
    val androidVersion= AndroidVersion()
    val getFirstName= androidVersion.fetchAndroidVersion().second // This will return -> Tiramisu
}