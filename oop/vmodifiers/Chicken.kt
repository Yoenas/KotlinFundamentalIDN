package com.yoenas.kotlinfundamental.oop.vmodifiers

class Chicken(val name: String, umur: Int, berat: Double) : Animal(name, umur, berat) {

    fun halalFood(){
        if (halal) {
            // mencoba mengakses property 'berat' yang memiliki akses modifier protected
            println("$name halal untuk dimakan, maka kita punya cadangan makanan sebanyak $berat")
        } else {
            println("$name tidak halal, maka tidak bisa dijadikan sebagai cadangan makanan")
        }
    }
}