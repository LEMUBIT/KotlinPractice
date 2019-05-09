import java.util.*

fun main() {
    outPut(8, 7, 6, 0, 9, 8, 8, 6)

    /*
    * Kotlin requires you to explicitly unpack
    * the array, so that every array element
    * becomes a separate argument to the function
    * being called. Technically, this feature is
    * called using a spread operator, but in
    * practice it’s as simple as putting the * character
    * before the corresponding argument
    * */
    val lst = intArrayOf(8, 0, 1)
    outPut(*lst)

}

fun outPut(vararg x: Int) {
    x.forEach { println(it) }
}