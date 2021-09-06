package com.yoenas.kotlinfundamental.oop.vmodifiers

open class Animal(
    var nama: String,
    private var umur: Int,
    protected var berat: Double,
    protected var halal: Boolean = true
) {
    fun info() {
        println("Nama: $nama \nBerat: $berat kg \nUmur: $umur tahun \nHalal: $halal")
    }
}