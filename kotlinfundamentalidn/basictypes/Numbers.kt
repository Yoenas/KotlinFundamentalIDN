fun main(args: Array<String>) {
    val classes = 6
    val absent: Byte = 20
    val students: Short = 120
    val schoolFees: Int = 3000000
    val ccNumber: Long = 1234_5678_9012_3456
//    val nisn = 01230448 // error karena Integer tidak support penulisan 0 sebagai angka awal

    val schoolFund = students * schoolFees
    println(schoolFund)

//    val number: Float = 2.7182818284f   // error karena terdapat 2 id variable yang sama persis
//    val number: Double = 2.7182818284f  // error karena tipe data Double namun diisi oleh Float
    val pi = 3.14 // Double
    println(pi)

    val circleArea = pi * 7 * 7
    val convCircleArea: Int = circleArea.toInt()
    println(convCircleArea)

    val studentCode = classes + absent
    val convStudentCode: Double = studentCode.toDouble()
    println(convStudentCode)
}