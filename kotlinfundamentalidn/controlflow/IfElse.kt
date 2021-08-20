fun main() {
    val a = 8
    val b = 19
    var max: Int? = null
    var min: Int? = null

    if (a < b) max = b
    println(max)

    if (a > b) min = b
    println(min)

    val nilai = 94
    if (nilai > 92) {
        println("Anda memperoleh nilai A")
    } else {
        println("Anda harus mengulang")
    }

    if (4 > 8) max = 8 else max = 4
    println(max)

    max = if (a > b) a else b
    min = if (a < b) a else b

    println(max)
    println(min)
}