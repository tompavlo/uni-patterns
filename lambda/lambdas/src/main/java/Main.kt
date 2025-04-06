import java.util.*

val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).shuffled()
val words = arrayListOf("a", "ab", "ba", "baa", "caa").shuffled()
val sentence =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"

fun main(args: Array<String>) {
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    println(numbers.filter { isEven(it) })


    val averageFromList: (Iterable<Int>) -> Double = { list ->
        var sum = list.sum().toDouble()
        sum /= list.count()
        sum
    }
    println(averageFromList(numbers))
    println(numbers.sumOf { it }.div(numbers.size.toDouble()))


    println(words.sortedBy { it.lowercase(Locale.getDefault()) })

    println(numbers.sumOf { if (it.isEven()) it else 0 })
    println(numbers.filter(isEven).sum())

    val factorial: (Int) -> Int = {
        var result = 1
        for (i in 1..it) {
            result *= i
        }
        result
    }


    println(factorial(9))

    val sumAndMultiply: (Int) -> Int = {
        it * it + it
    }
    println(numbers.sumOf(sumAndMultiply))

    val toSqrt = { it: Int ->
        it * it
    }
    println(numbers.map { toSqrt(it) })

    println(words.sortedBy { it.length })

    println(sentence.split(' ').count())

    println(words.first { it.isNotEmpty() })

    println(
        words.all { it[0].isUpperCase() }
    )

    println(numbers.distinct().sortedDescending()[1])

    println(numbers.filter { isEven(it) }.maxOf { it })


}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}
