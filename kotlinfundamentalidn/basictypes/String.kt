fun main() {
    val salam = "Assalamu'alaikum"
    println(salam)

    val basmallah = "Bismillah"
    for (b in basmallah) {
        println(b)
    }

    val karakterPertama = basmallah[0]
    println(karakterPertama)
    val karakterTerakhir = basmallah[8]
    println(karakterTerakhir)

// mengambil karakter terakhir dengan fungsi
    val charTerakhir = basmallah.last()

    val supr = "Yoenas " + 19
    println(supr + "dev")

    val s = "Yus"
    println("$s.length is ${s.length}")
}