package com.yoenas.kotlinfundamental.oop.inheritance

fun main() {
    val myTeacher = PrivateTeacher("Yusril", "yusrilnuradi63@gmail.com", "Android")
    myTeacher.capacity(8)

    val myHomeRoom = PublicTeacher("Turyatna", "tury.atna@gmail.com", "Android")
    myHomeRoom.school("SMK IDN Boarding School")
}