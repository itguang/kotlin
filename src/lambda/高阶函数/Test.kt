package lambda.高阶函数

// 函数式风格的 fold ,接收一个初始累计和一个结合函数,并将初始值和集合中每个元素结合起来

fun <T, R> Collection<T>.myFold(
    inital: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = inital
    for (item in this) {
        accumulator = combine(accumulator, item)
    }
    return accumulator
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val combine = { acc: Int, i: Int ->
        val result = acc + i
        result
    }
    val sum = list.myFold(0, combine)
    // 如果函数的最后一个参数是函数,lambda 可以放在圆括号之外
    list.myFold(0) { acc: Int, i: Int ->
        val result = acc + i
//        return@myFold result
        result
    }
    // it: 单个参数的隐式名称
    list.filter { i: Int -> i > 2 }
    list.filter { it > 2 }

    // 从 lambda 表达式返回一个值
    list.filter {
        var b = it > 1
        return@filter b
    }

    // 下划线用于未使用的变量
    list.forEach { println(it) }



    println(sum)
}