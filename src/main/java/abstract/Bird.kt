package abstract

class Bird : Move() {
    override fun start() {
        println("Flying")
    }

    override fun drink() {
        super.drink()
        println("Drinking through beak")
    }
}