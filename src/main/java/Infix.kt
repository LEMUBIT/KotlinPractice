/*
* Infix calls can be used with regular methods
* and extension functions that have one required
* parameter. To allow a function to be called
* using the infix notation, you need to mark it
* with the infix modifier.
* */


fun main() {
    val john = "John"
    val samuel = "samuel"

    println(john.and(samuel))

    //In an infix call, the method name is placed immediately between the target object name and the parameter, with no extra separators.
    println(john and samuel)

}

infix fun String.and(name: String): String {
    return "$this and $name are friends now"
}