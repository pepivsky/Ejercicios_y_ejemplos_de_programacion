package com.company.designPatterns.creationalPatterns.singleton.example.kotlin

class Singleton private constructor(message: String) {

    companion object {

        @Volatile
        private var INSTANCE: Singleton? = null

        fun getInstance(message: String): Singleton =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Singleton(message = message ).also { INSTANCE = it }
            }

    }

}

fun main() {
    val instance1 = Singleton.getInstance("PP")
    val instance2 = Singleton.getInstance("Blanquis")

    println(instance1 === instance2)

}