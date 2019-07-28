package kotlin中的基本数据类型

fun main() {
    val person = Person("itguang")
    val age = person.age
    age ?: fail("年龄不能为空")
    println("age=$age")
}

// Nothing 表示函数不会正常结束,这个函数永远不会返回
fun fail(msg: String): Nothing {
    throw IllegalStateException(msg)
}