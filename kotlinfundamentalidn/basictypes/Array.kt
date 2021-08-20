fun main() {
    val arr = arrayOf(1, 2, 3)
    val arrMix = arrayOf(5, 6, 7, "Yusril kece", true)

    // array yang hanya berisikan satu tipe data primitive
    val arrX = intArrayOf(21, 22, 23, 24)
    val arrY = booleanArrayOf(true, true, false)
    val arrZ = charArrayOf('Y', 'o', 'e', 'n', 'a', 's')

    // membuat Array<String> dengan nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }
}