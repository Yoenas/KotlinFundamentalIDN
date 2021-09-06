package com.yoenas.kotlinfundamental.oop.inheritance

open class Teacher(name: String, email: String, val subject: String): Person(name, email) {
    fun specialSubject() {
        info()
        println("Is teacher who teaches subject $subject")
    }
}