fun main() {
    //Count from 1 to 10
    for (i in 1..10) {
        println("Number $i")
    }

    //Counts down, and skips some numbers
    for (i in 10 downTo 1 step 2) {
        println("Backwards: Number $i")
    }

    //Does not include last number 10
    for (i in 1 until 10) {
        println("Until: number $i")
    }


    //Iterating over map
    val scores = HashMap<String, String>()
    scores["John"] = "99"
    scores["James"] = "70"

    for ((name, score) in scores) {
        println("$name has score = $score")
    }


    val names= arrayListOf("Lambo","Ferrari","Toyota")

    for((index,name) in names.withIndex())
    {
        println("Index:$index with name:$name")
    }


}