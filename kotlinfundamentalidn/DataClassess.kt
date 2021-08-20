// data class
data class DataManusia(
    var name: String,
    var age: Int,
    val height: Int,
    val weight: Int,
    val religion: String
)


// function
fun main(args: Array<String>) {
    val yusril = DataManusia("Yusril", 19, 182, 65, "ISLAM")
    println(yusril)

    // fungsi equals()
    val fulan = DataManusia("Yusril", 19, 182, 65, "ISLAM")
    val bagidil = DataManusia("Bagidil", 24, 182, 70, "ISLAM")

    println(fulan.equals(yusril))
    println(bagidil.equals(yusril))

    // fungsi copy()
    val bagidil2 = bagidil.copy()
    val bagidilRandom = bagidil.copy(age = 30, weight = 75)

    println(bagidil2)
    println(bagidilRandom)

    // fungsi componentN()
    println("Hello world!")
    println(
        """
      |Perkenalkan, seorang yang tampan & kece namun lugu.
      |Nama: ${yusril.component1()}
      |Umur: ${yusril.component2()} tahun
      |Tinggi Badan: ${yusril.height} cm
      |Berat Badan: ${yusril.weight} kg
      |Agama: ${yusril.religion}
      """
    )
}