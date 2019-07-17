package test

fun main() {
    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        else -> {
            println("x 不是 1")
        }
    }

    when (x) {
        in 0..10 -> {
            println("x in [0,10]")
        }
        else -> println("x not in [0,10]")
    }

    var items = setOf<String>("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
        else -> println("not orange and apple")
    }
}