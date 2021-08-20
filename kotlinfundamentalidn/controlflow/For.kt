fun main() {
    val tasbih = "Subhanallah walhamdulillah walaa ilaha ilallah wallahuakbar"
    for (count in 1..33) {
        println(tasbih)
    }

    // urutan item/elemen dalam sebuah array
    val attendance = arrayOf("Bagidil", "Buchori", "Jaja", "Rizad", "Ucup")
    for (name in attendance) {
        println("Atas nama $name")
    }

    // karakter dalam String
    val name = "Yusril"
    for (name in name) {
        // code
        println("\"$name\"")
    }

    for (i in 1.rangeTo(5)) {
        println(i)
    }

    for (index in (19.downTo(9) step 3)) {
        println(index)
    }

    val range = 1.rangeTo(9)
    range.forEach { value ->
        print("$value ")
    }

    range.forEachIndexed { index, value ->
        println("index $index bernilai $value")
    }
}
