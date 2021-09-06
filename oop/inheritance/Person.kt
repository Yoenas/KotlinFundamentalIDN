package com.yoenas.kotlinfundamental.oop.inheritance

open class Person(val name: String, val email: String) {
    fun info() {
        println("Name: $name\nEmail: $email")
    }
}