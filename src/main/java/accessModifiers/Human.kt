/**
 * You have the same public, protected, and private modifiers.
 * But the default visibility is different:
 * if you omit a modifier, the declaration becomes public.
 *
 * The default visibility in Java, package-private, isn’t present in Kotlin.
 * Kotlin uses packages only as a way of organizing code in namespaces;
 * it doesn’t use them for visibility control.
 *
 * As an alternative, Kotlin offers a new visibility modifier,
 * internal, which means “visible inside a module.”
 *
 * A module is a set of Kotlin files compiled together.
 * It may be an IntelliJ IDEA module, an Eclipse project,
 * a Maven or Gradle project, or a set of files compiled with
 * an invocation of the Ant task.
 * **/
package accessModifiers

class Human(var name: String) {
   fun whatIsYourName()
   {
       println("My name is $name")
   }
}