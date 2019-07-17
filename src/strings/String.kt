package strings

/**
 *方法参数默认值
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    perfix: String = "",
    postfix: String = ""
): String {
    var result = StringBuilder(perfix);
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


// 扩展函数和属性

/**
 * 扩展函数和属性: 获取最后一个字符
 */
fun String.lastChar(): Char = this.get(this.length - 1)

/**
 * 扩展集合函数
 */
fun <T> Collection<T>.myJoinToString(
    separator: String = ", ",
    perfix: String = "", postfix: String = ""
): String {
    var result = StringBuilder(perfix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// 声明一个扩展属性

val String.myLastChar: Char
    get() = this.get(length - 1)


var StringBuilder.myLastChar: Char
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }



