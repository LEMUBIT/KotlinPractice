fun main() {
    val x = 5

    val result = when (x) {
        3 -> 3.0
        5 -> {
            //“the last expression in a block is the result”
            println("I think this is the answer")
            5.0
        }
        else -> 0.0
    }

    println(result)

}