fun main() {
    val start: Int = 1
    val command: String

    if (start == 3) {
        command = "Ready"
    } else if (start == 2) {
        command = "Set"
    } else {
        command = "Go!"
    }
    println(command)

    val lamp = "Kuning"

    if (lamp == "Merah") {
        println("Kendaraan harus berhenti")
    } else if (lamp == "Kuning") {
        println("Kendaraan harus berhati-hati")
    } else if (lamp == "Hijau") {
        println("Kendaraan melanjutkan perjalanan")
    } else {
        println("Lampu lalu lintas tidak berfungsi dengan baik, berhati-hatilah!")
    }
}