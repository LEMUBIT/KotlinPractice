/**
 * Sealed classes are used for representing restricted class hierarchies,
 * when a value can have one of the types from a limited set,
 * but cannot have any other type. They are, in a sense,
 * an extension of enum classes: the set of values for an
 * enum type is also restricted, but each enum constant exists
 * only as a single instance, whereas a subclass of a sealed
 * class can have multiple instances which can contain state.
 * 
 * A sealed class is abstract by itself, it cannot be
 * instantiated directly and can have abstract members.
 *
 * You mark a superclass with the sealed modifier,
 * and that restricts the possibility of creating subclasses.
 * All the direct subclasses must be nested in the superclass.
 *
 * When you use when with sealed classes and add a new subclass,
 * the when expression returning a value fails to compile,
 * which points you to the code that must be changed.
 *
 *
 * **/
package sealedClasses

sealed class Human(var name:String) {
    fun run()
    {
        println("Running")
    }

    class Soldier(name: String) : Human(name)
}