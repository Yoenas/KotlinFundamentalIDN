package com.yoenas.kotlinfundamental.oop

fun main() {
    val anjing = Binatang("Korone", 20.5f, true)
    anjing.info()

    println()

    val kucing = Binatang("Okayu", 5.2f, true, 4)
    kucing.info()
}

class Binatang(nama: String, berat: Float, berbulu: Boolean) {
    val nama: String
    val berat: Float
    val berbulu: Boolean
    var umur: Int? = null

    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu
    }

    constructor(nama: String, berat: Float, berbulu: Boolean, umur: Int) : this(nama, berat, berbulu) {
        this.umur = if (umur < 0) 0 else umur
    }

    fun info() {
        println("Nama: $nama \nBerat: $berat \nHewan Berbulu: $berbulu \nUmur: $umur tahun")
    }
}