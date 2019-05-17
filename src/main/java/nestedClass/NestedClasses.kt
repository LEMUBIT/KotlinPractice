package nestedClass

class NestedClasses(val title: String) {
    fun whatTitle(): String {
        return title
    }

    /**
     * A nested class in Kotlin with no explicit modifiers is the
     * same as a static nested class in Java. To turn it into an
     * inner class so that it contains a reference to an outer class,
     * you use the inner modifier.
     * **/
      class NestedCheck(private val anotherTitle: String) {

        fun whatOtherTitle(): String {
            //The syntax to reference an instance of an outer class in Kotlin also differs from Java. You write this@Outer to access the Outer class from the Inner class
            //Commented code below would run when class is inner
            //this@NestedClasses.whatTitle()
            return anotherTitle
        }
    }

}