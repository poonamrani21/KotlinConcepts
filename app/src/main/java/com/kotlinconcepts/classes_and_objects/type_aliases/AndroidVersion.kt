package com.kotlinconcepts.classes_and_objects.type_aliases

class AndroidVersion {
    fun fetchUser():Triple<String, String, Int>{
        return Triple("Android","Dev",13)
    }

    //After
    fun fetchUserData():TripleAliases{
        return TripleAliases("Android","Dev",1)
    }

    val appName= StringResource.app_name
}