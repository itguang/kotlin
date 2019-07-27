package collection.list

class TestList {
}

fun main() {
    val list = arrayListOf(1, 2, 3, 4, 9, 8, 5, 7)
    val mutableList = list.toMutableList()
    mutableList.add(10)

    // 返回一个只读集合
    val toList = list.toList()

    // list 转 set
    val mutableSet = list.toMutableSet()

    // 分区
    val partition = list.partition { it > 5 }
    val first = partition.first
    val second = partition.second
    println(partition)

    // + - 操作符
    val plusList = list + 1
    println(plusList)
    val minusList = plusList - listOf(1, 2)
    println(minusList)

    // 分组
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    val message = numbers.groupingBy { it.first() }.eachCount()
    val i = message['o']
    println(message)

    var chunked: List<List<String>> = numbers.chunked(3)
    println(chunked)

}