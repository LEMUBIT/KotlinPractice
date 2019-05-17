/**
 * Whereas Java’s classes and methods are open by default,
 * Kotlin’s are final by default.
*If you want to allow the creation of subclasses of a class,
 * you need to mark the class with the open modifier.
 * In addition, you need to add the open modifier to every
 * property or method that can be overridden.
 * **/
package OpenFinal

open class Human(var name: String) {
   open fun getname():String {
        return name
    }
}