fun main() {
    var a = !true
    println(a)

    var b = !false
    println(b)

    val isOpen = true && false
    println("Office is Open: $isOpen")

    val isClose = false || true
    println("Office is Close: $isClose")

    val open = true && !false
    println("Office opened is: $open")
}