fun main() {
    val programmer = Orang()   // object dari class Orang
    programmer.mata = "minus"  // attribute atau properti
    programmer.kaki = 6        // memberikan value atau inisialisasi
    programmer.menulis()

    val pendaki = Orang()
    pendaki.melihat()
    pendaki.mendengar()
    pendaki.berjalan()
    pendaki.bersuara()
}

class Orang {
    var mata = "normal"
    var mulut = true
    var daunTelinga = 2
    var kondisiTangan: String? = "kuat"
    var kaki: Int? = 2

    fun melihat(){
        println("Mampu melihat dengan mata yang $mata")
    }

    fun bersuara() {
        if (mulut == true){
            println("Mampu mengeluarkan suara yang kuat")
        } else {
            println("Dianugerahi untuk tidak melukai sesama melalui mulutnya")
        }
    }

    fun mendengar() {
        println("Mampu mendengar dengan baik $daunTelinga daun telinganya")
    }

    fun menulis() {
        println("Mampu menulis dengan tangan yang $kondisiTangan")
    }

    fun berjalan() {
        println("Mampu berjalan dengan $kaki kakinya")
    }
}