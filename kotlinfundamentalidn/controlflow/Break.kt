fun main() {
    val tasbih = "Subhanallah walhamdulillah walaa ilaha ilallah wallahuakbar"
    for (count in 1..100) {
        println(tasbih)
        if (count == 34) break
    }

    val istighfar = "astaghfirullah"
    for (count in 1..7) {
        println(istighfar)
        break
    }

    var sum = 0
    var i = 1
    // bagaimana menjumlahkan bilangan dari rentang 1 sampai seratus
    // namun berhenti jika nilai yang dijumlahkan sudah melebihi 1000
    while (i <= 100) {
        sum += i
        i++
        if (sum > 1000) {
            break
        }
        println(sum)
    }
    println(sum)
}