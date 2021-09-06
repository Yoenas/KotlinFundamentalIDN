package com.yoenas.kotlinfundamental.oop.abstraction

// buatlah class Square untuk menghitung luas dan keliling persegi
class Square(val side: Float) : Figure() {
    override fun getArea(): Float {
        return side * side
    }

    override fun getPerimeter(): Float {
        return side * 4
    }
}