fun main() {
    //you can initialize two variables with the contents of a Pair directly
    //You create a pair using the to function and unpack it with a destructuring declaration.
    val (number, name) = 99 to "Daniel"
    println(name)

    //This also works with loops
    val scores = listOf(1, 2, 3, 4)

    for ((index, value) in scores.withIndex()) {
        println("Position $index with value $value")
    }
}