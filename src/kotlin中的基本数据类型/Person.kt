package kotlin中的基本数据类型

data class Person(val name: String, val age: Int? = null) {
    fun isOrderThan(other: Person): Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        // 对 val 变量进行检查之后,编译器会自动记住该值的类型
//        return age!! > other.age!!
        return age > other.age
    }
}