fun main() {
    val set = setOf(1, 2, 3, 4, 2, 3)
    println(set)

    val sets = setOf(1, 2, 3, 4)
    println("Number of elements: ${sets.size}")
    if (sets.contains(1)) println("1 is in the set")

    val setsBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${sets == setsBackwards}")

    val mutableSets = mutableSetOf(1, 2, 3, 4, 1)
    println(mutableSets)
    mutableSets.add(5)    // add element at last of set
    mutableSets.remove(1) // remove items thats have a value of 1
    println(mutableSets)
    // mutableSets[0] = 0    // can't change value of set

    val union = sets.union(mutableSets)
    println("Union of sets to mutableSets is: $union")

    val intersect = sets.intersect(mutableSets)
    println("Intersect of sets to mutableSets is: $intersect")
}