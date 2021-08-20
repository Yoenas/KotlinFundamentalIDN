fun main() {
    var kosong: String? = null
    val kosongan: Int? = null
    val kekosongan: Array<String>? = null

    println(kosong)
    kosong = "Yoenas"
    println(kosong)

    val name: String? = null
    println(name?.length) // compile time error

    // akses atau mengelola dengan if/else
    if (name != null) {
        println(name.length) // ready to go
    } else {
        println("kalau ini diprint, berarti variablenya null")
    }

    // akses dengan Safe Calls
    println(name?.length)

    // akses dengan Elvis Operator
    println(name?.length ?: "Yusril")
}