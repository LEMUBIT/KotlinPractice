fun main()
{
    val ss = "\\d{4}".toRegex()
    val result = ss.matches("2222")
    println(result)
}