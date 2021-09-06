package com.yoenas.kotlinfundamental.oop


class Bird(val kind: String, val weight: Double, val feather: Boolean) {

    fun fly() {
        println("$kind bisa terbang? $feather")
    }

    fun hunt(food: String) {
        println("$kind berburu $food untuk menjaga berat badannya yang $weight kg")
    }
}

// Buatlah class gedung yang mempunyai constructor nama gedung, jumlah lantai, warna
// di dalam class gedung buatlah sebuah function acara dengan parameter acara
// cetak teks berikut melalui function acara
// Gedung bernama "___" berwarna "___" dengan "___" lantai sedang mengadakan acara "___".
// dari class tersebut buatlah object IDN di function main

class Gedung(val nama: String, val jumlah: Int, val warna: String) {
    fun acara(acara: String) {
        println("Gedung bernama $nama berwarna $warna dengan $jumlah lantai sedang mengadakan acara $acara")
    }
}


class Hewan(nama: String, berat: Double, berbulu: Boolean, umur: Int){

    val nama: String
    val berat: Double
    val berbulu: Boolean
    val umur: Int

    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1 else berat
        this.berbulu = berbulu
        this.umur = umur
    }

    fun info(){
        println("Nama: $nama \nBerat: $berat kg \nBerbulu: $berbulu \nUmur: $umur tahun")
    }
}

fun main() {
    val pigeon = Bird("Pigeon", 1.3, true)
    pigeon.fly()
    pigeon.hunt("cereal")

    val penguin = Bird("Penguin", 5.4, false)
    penguin.fly()
    penguin.hunt("fish")

    val idn = Gedung("Gedung IDN", 4, "Biru")
    idn.acara("Buka Puasa Bersama")

    val lion = Hewan("Lion", 90.0, false, 15)
    lion.info()
}