package com.yoenas.kotlinfundamental.oop.polymorphism

fun main() {
    val animal = Animal()
    animal.sound()

    val duck = Duck()
    duck.sound()

    val cat = Cat()
    cat.sound()
}