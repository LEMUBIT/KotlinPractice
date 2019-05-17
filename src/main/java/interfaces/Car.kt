/**
 * Kotlin uses the colon after the class name to replace both
 * the extends and implements keywords used in Java.
 * As in Java, a class can implement as many interfaces as it wants,
 * but it can extend only one class.
 * **/
package interfaces

class Car : Motor {
    override fun startEngine() {
        println("Engine Started")
    }
}