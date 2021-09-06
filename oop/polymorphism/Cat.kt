package com.yoenas.kotlinfundamental.oop.polymorphism

class Cat : Animal() {
    override fun sound() {
//        super.sound()
        println("Suara kucing: miao")
    }
}