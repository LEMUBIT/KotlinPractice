fun main() {

    val num = "22"

    /**If the execution of a try code block
     * behaves normally, the last expression
     * in the block is the result.
     * If an exception is caught, the last
     * expression in a corresponding catch block
     * is the result.**/
    val integerNum =
        try {
            Integer.parseInt(num)
        } catch (e: Exception) {
            null
        }

    println(integerNum?.times(2))
}