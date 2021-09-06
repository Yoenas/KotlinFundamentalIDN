package com.yoenas.kotlinfundamental.oop.polymorphism

class Duck : Animal() {
    override fun sound() {
//        super.sound()
        println("Suara bebek: wkwkwkwkwk")
    }
}