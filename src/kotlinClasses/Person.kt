package kotlinClasses

class Person(var name: String, var age: Int) {

    //custom implementation of a property accessor
    val isAdult: Boolean
        get() {
            return age >= 18
        }
}