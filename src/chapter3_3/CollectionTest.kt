package chapter3_3

import strings.myJoinToString

fun main() {
    val list = arrayListOf(1, 2, 3)
    println(list.myJoinToString(separator = ",", perfix = "[", postfix = "]"))
}