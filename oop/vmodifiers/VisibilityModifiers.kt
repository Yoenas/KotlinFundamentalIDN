package com.yoenas.kotlinfundamental.oop.vmodifiers

fun main() {
    val chicken = Animal("Chicken", 1, 3.4)  // bisa dipanggil karena modifiernya public
    chicken.nama = "White Rose"  // bisa dipanggil karena modifiernya public
//    chicken.umur = 1      // error karena modifiernya private
//    chicken.berat = 2.0   // error karena modifernya protected
    chicken.info()          // bisa dipanggil karena modifiernya public

    val whiteRose = Chicken("Chicky", 1, 5.3)
    whiteRose.halalFood()
}
