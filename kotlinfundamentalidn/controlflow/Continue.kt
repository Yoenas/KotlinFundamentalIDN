fun main() {
    for (n in 1..7) {
        if (n == 4) continue
        print("$n ")
    }

    var sum = 0
    var i = 1
    // bagaimana menjumlahkan seluruh bilangan genap dari rentang 1 sampai 100
    while (i <= 100) {
        sum += i
        i++
        if (i % 2 == 1) {
            continue
        }
    }
    println(sum)
}