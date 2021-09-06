package com.yoenas.kotlinfundamental.oop.abstraction

fun main() {
    val segitigaSamaSisi = Triangle(9f, 5f)
    println(segitigaSamaSisi.getArea())
    println(segitigaSamaSisi.getPerimeter())

    // buat object square untuk menjalankan penghitungan luas & keliling persegi
    val square = Square(4f)
    println(square.getArea())
    println(square.getPerimeter())
}