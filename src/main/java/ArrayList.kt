fun main() {
    val scores = arrayListOf(1, 2, 3, 4)

    scores.forEach { println("Simple foreach: $it") }

    println("Last Element = ${scores.last()}")

    scores.asSequence().map { it*2 }.filter { it > 4 }.forEach { println("Using sequence >4: $it") }

    val names = hashMapOf(1 to "bob", 2 to "daniel")

    println("From has map key 1 = ${names[1]}")

    println(scores)

    println(scores.joinToString("/"))
}
