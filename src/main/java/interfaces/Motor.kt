/**
 * An interface method can have a default implementation.
 * Unlike Java 8, which requires you to mark such implementations
 * with the default keyword, Kotlin has no special annotation for
 * such methods: you just provide a method body.
 * **/
package interfaces

interface Motor {
    fun startEngine()
    fun stop() {
        println("Engine stopped")
    }
}