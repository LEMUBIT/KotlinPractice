/**
 * The function declaration starts with the fun keyword,
 * followed by the function name: multiple, in this case.
 * It’s followed by the parameter list in parentheses.
 * The return type comes after the parameter list,
 * separated from it by a colon.
 * **/

fun main() {
    println(multiple(4))
    println(max(5,2))
}

fun multiple(number: Int): Int {
    return number * 2
}

/**
 * In Kotlin, if is an expression, not a statement.
 * The difference between a statement and an expression is that an expression has a value,
 * which can be used as part of another expression, whereas a statement is always a top-level element
 * in its enclosing block and doesn’t have its own value.
 * **/

fun max(a: Int, b: Int): Int = if (a > b) a else b