package 类型系统.空安全

val a: String = "kotlin"
val b: String? = null


fun main() {
    println(a.length)
    println(b?.length)

    val list = listOf<String?>("kotlin", null)

    for (item in list) {
        item.let { s: String? -> println(s) }
        item.let { println(it) }

    }
}


