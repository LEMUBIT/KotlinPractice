package abstract

abstract class Move {
    //Abstract members are always open, so you don’t need to use an explicit open modifier.
    abstract fun start()

    open fun drink() {
        println("Drinking Water")
    }

    fun sleep() {
        println("Sleeping")
    }
}