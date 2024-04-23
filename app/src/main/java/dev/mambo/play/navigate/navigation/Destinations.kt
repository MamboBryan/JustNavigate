package dev.mambo.play.navigate.navigation

/**
 * project : Navigate
 * date    : Tuesday 23/04/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

// TODO : 5 - declare a class to hold all your destination routes (decided to use a sealed class cause of difference in class type declarations)
sealed class Destinations(private val path: String) {

    val route: String
        get() = buildString {
            append("navigate/")
            append(path)
        }

    data object List : Destinations(path = "list")

    data class Detail(val id: Int) : Destinations(path = "list/$id") {
        companion object : Destinations(path = "list/{id}") {
            const val KEY: String = "id"
        }
    }

}