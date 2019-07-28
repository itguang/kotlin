package kotlin中的基本数据类型.集合与数组

/**
 * 可空性和集合
 */
fun main() {

    val arrayList = ArrayList<Int?>()

    val numbers = listOf<Int?>(1, 2, 3, 4, 5, null)

    val validNumbers = addValidNumbers(numbers)
    println(validNumbers.toString())


}

fun addValidNumbers(numbers: List<Int?>): List<Any> {
    return numbers.filterNotNull()
}

