package 类型系统.空安全

fun main() {
    val person = Person()
    val person1 = Person("itguang")

    //扩展java中的函数
    fun Person.my() = println("name = ${this.name}")

    // 扩展函数不能扩展已存在的函数,可以使用包装器模式
    fun Person.getName(): String? = this.name + "哈哈哈"

    // 在与 java 互操作时,不用 null 检查就能访问java类
    val name: String = person1.name

    println(name.length)

    // 调用扩展函数
    person.my()
    person1.my()
    println(person1.name)


}