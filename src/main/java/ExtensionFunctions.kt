/* extension function is a simple thing:
it’s a function that can be called as a
member of a class but is defined outside of it*/

/*All you need to do is put the name of the
class or interface that you’re extending before
the name of the function you’re adding.
This class name is called the receiver type;
the value on which you’re calling the extension
function is called the receiver object.*/
fun main() {
    val love = "love"
    println(love.check())
}

fun String.check(): Boolean {
    return this.length <= 5
}