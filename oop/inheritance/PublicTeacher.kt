package com.yoenas.kotlinfundamental.oop.inheritance

class PublicTeacher(name: String, email: String, subject: String) :
    Teacher(name, email, subject) {

    fun school(school: String) {
        specialSubject()
        println("Teaching at $school as a public teacher")
    }
}