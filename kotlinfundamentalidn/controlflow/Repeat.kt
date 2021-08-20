fun main() {
    perpangkatan(4, 3)
    barakallah("Yusril", 19)
}

fun perpangkatan(a: Int, pangkatnya: Int) {
    var result = a
    repeat(pangkatnya-1) {
        result *= a
    }
    println(result)
}

fun barakallah(name: String, age: Int){
    // Semoga Allah melimpahkan keberkahan-Nya padamu
    println("Barakallahu fiik ${name} atas ${age} tahunnya merasakan manis pahit kehidupan..")
    lilinKueUlangTahun(age)
    kueUlangTahun(age)
}

fun lilinKueUlangTahun(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun kueUlangTahun(wide: Int){
    repeat (4){
        repeat (wide + 2){
            print("@")
        }
        println()
    }
    println()
}