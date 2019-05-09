package kotlinClasses

fun main() {
    val john = Person("John", 24)
    println("${john.name} is ${john.age} years old")

    //Remember that If statements are expressions
    println(if (john.isAdult) "John is an adult" else "He is not an adult")
}