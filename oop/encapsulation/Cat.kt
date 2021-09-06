package com.yoenas.kotlinfundamental.oop.encapsulation

class Cat {
    private var mood: Int = 3
    private var hungry: Int = 3
    private var energy: Int = 3

    private fun meow() {
        println("MEOW,, MEOWW, MEOW!")
    }

    fun sleep() {
        energy++
        hungry++
        println("Status of Cat: \nmood: $mood \nhungry: $hungry")
    }

    fun play() {
        mood++
        energy--
        meow()
        println("Status of Cat: \nmood: $mood hungry: $hungry")
    }

    fun feed() {
        mood++
        hungry--
        meow()
        println("Status of Cat: \nmood: $mood hungry: $hungry")
    }
}