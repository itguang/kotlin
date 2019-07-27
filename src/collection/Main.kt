package collection

fun main() {
    val numbers: List<Int> = (0..13).toList()
    val words = listOf("one", "two", "three", "four", "five", "six")

    val chunked: List<Int> = numbers.chunked(3) { it.sum() }
    println(chunked)

    val windowed = numbers.windowed(3)
    println(windowed)

    // 取单个元素

    // 按位置取
    println("按位置取" + numbers.elementAt(1))

    // 按条件获取
    println(words.first { it.length > 3 })
    println(words.last { it.startsWith("f") })
    println("按条件获取" + numbers.first { it > 10 })

    // 检测存在与否
    println("words.contains(\"one\")" + words.contains("one"))

    // 排序
    words.sortedBy { it.length }




}