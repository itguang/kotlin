package kotlin中的基本数据类型.集合与数组

/**
 *  kotlin 中的 Array 类就像普通的泛型类, 但它会被编译成 java 的数组
 *
 */
fun main() {
    val list = listOf<String>("a", "b", "c")


    // 基本类型的数组可以用 IntArray
    val args = list.toTypedArray()

    // 期望 vararg 参数时,使用展开运算符 * 传递数组
    println("%s-%s-%s".format("a", "b", "c"))
    println("%s-%s-%s".format(*args))

    args.forEachIndexed { index, item ->
        println("$index ==> $item")
    }
}