package com.yoenas.kotlinfundamental.oop.inheritance

class PrivateTeacher(name: String, email: String, subject: String) :
    Teacher(name, email, subject) {

    fun capacity(students: Int) {
        specialSubject()
        println("As a Private Teacher able to teach $students students")
    }
}