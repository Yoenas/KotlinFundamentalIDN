fun main() {
    // 1 type data element in list
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("First element: ${numbers[0]}")
    println("Third element: ${numbers.get(2)}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

    // some type data element in list
    val anyList = listOf('a', 3, "is important", true)
    println(anyList)

    val mutableNumbers = mutableListOf(1, 2, 3, 4)
    println(mutableNumbers)
    mutableNumbers.add(5)      // add 5 as element at last index
    mutableNumbers.removeAt(1) // remove index 1
    mutableNumbers[0] = 0      // change value of index 0
    println(mutableNumbers)

    mutableNumbers.shuffle()   // shuffle all elements in list
    println(mutableNumbers)

    // data class as element in list
    val bob = Person("Bob", 31)

    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)

    println(people == people2)
    bob.age = 32
    println(people == people2)
}

data class Person(var name: String, var age: Int)