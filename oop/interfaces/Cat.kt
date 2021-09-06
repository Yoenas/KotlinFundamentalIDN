package com.yoenas.kotlinfundamental.oop.interfaces

class Cat : Pet {
    override fun play() {
        println("Ajak Kucing bermain lari-lari, muter-muter & gigit")
    }

    override fun eat() {
        println("Beri whiskas sebagai makanan Kucing")
    }

    override fun sleep() {
        println("Kucing menghabiskan 1/3 kehidupannya untuk tidur")
    }
}