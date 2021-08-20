fun main() {
    val character = 'I'
    val char: Char = 'D'
    println(character + "$char" + 'N')

    // escape character \t, \b , \n , \r , \' , \" , \\ , \$ and \u
    println("Hello world!")
    println("\tHello world!") // memberikan indentasi
    println("\nHello world!") // memberikan baris baru atau enter
    println("\'Hello world!") // memuat tanda '
    println("\"Hello world!") // memuat tanda "
    println("\\Hello world!") // memuat tanda \
    println("\$Hello world!") // memuat tanda $

    val unique: Char = 'ಢ'
    val convertToInt: Int = unique.toInt()
    println(convertToInt)
    println("\u3234")
}