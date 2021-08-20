fun main() {
    val start: Int = 1

    when (start) {
        1 -> println("Ready")
        2 -> println("Set")
        3 -> println("Go!")
        else -> {
            println("command is not Ready, Set and Go!")
        }
    }

    val command: String = when (start) {
        1 -> {
            println("1 for Ready")
            "Prepare your mental for your preparation"
        }
        2 -> {
            println("2 for Set")
            "Put your position for better start"
        }
        3 -> {
            println("3 for Go!")
            "You're ready to go and begin a new life"
        }
        else -> {
            println("You are done")
            "You did a great life. Take your time!"
        }
    }
    println(command)

    when (start) {
        in 1..3 -> println("value is in the range")
        !in 1..3 -> println("value is outside the valid")
        in 0..3 -> println("actually value is in the range")
        else -> println("value is not valid")
    }

    val type: Any = 5
    when (type) {
        is Boolean -> println("value is Boolean type")
        is Char -> println("value is Char type")
        is Int -> println("value is Int type")
        is String -> println("value is String type")
        else -> println("value is Array or Numbers except Int type")
    }
}