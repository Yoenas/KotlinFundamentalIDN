fun main() {
    val sum = 1 + 9
    val sub = 6 - 2
    val multiplication = 3 * 5
    val division = 56 / 7

    val math = 10 / 6 - 2 + 4 * 8
    val math2 = ((((10 / 6) - 2) + 4) * 8)
    val math3 = 10 + 6 - 2 + 4 - 8
    val math4 = 10 * 6 / 2 / 4 * 8

    val a = sum.toDouble()
    val b = sub.toFloat()
    val c = multiplication.toByte()
    val d = math4.toString()

    val mod: Double = a % b
//    val mod2: Double = c % sum  // error karena mod2 diharuskan bernilai tipe Double
    val mod3 = 4 % 2
    val mod4 = 19 % 2
    val mod5 = 5 % 7
    val mod7 = 2 % 4
    val mod6 = 10.0 % 3.3
}