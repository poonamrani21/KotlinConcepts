package com.kotlinconcepts.classes_and_objects.type_aliases

import com.kotlinconcepts.R

/****
 * typeAlias in Kotlin means a way to give an existing type a new name. It provides an alternative naming to your existing type to reflect a more readable code.
 * - typeAlias helps to reduce the re-writing again and again. To move it to typeAlias we use
 */
typealias Drawable = R.drawable   //Now we can directly use the Drawable to call drawable resources
typealias Layout = R.layout   //Now we can directly use the Layout to call layout files
typealias StringResource = R.string   //Now we can directly use the StringResource to call string resource
typealias TripleAliases = Triple<String, String, Int>   //Now we can directly use the TripleAliases instead of [Triple<String, String, Int>]

/**
 * #Note: We can handle this things for click listeners, View classes and
 */
