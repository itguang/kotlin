package kotlin中的基本数据类型

fun main() {
    val person = Person("itguang", 25)
    println(person.isOrderThan(Person("xr", 35)))
    println(person.isOrderThan(Person("sb")))
}