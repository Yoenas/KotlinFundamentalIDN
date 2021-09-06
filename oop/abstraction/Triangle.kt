package com.yoenas.kotlinfundamental.oop.abstraction

class Triangle(private val base: Float, private val height: Float) : Figure() {

    override fun getArea(): Float {
        return 0.5f * (base * height)
    }

    override fun getPerimeter(): Float {
        return 3 * base
    }
}