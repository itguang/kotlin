package 类型系统.空安全

/**
 *  为可空类型 添加函数
 */

fun main() {

    var name: String? = null
    var address: String = ""

    println("name = ${name.isNullOrBlank()}")

}
