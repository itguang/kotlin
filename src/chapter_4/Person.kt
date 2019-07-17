package chapter_4

class Person(val name: String) {
    // 如果有主构造函数,需要在次构造函数中代理主构造函数
    constructor(name: String, age: Int) : this(name) {
        println("次构造函数:  constructor(name: String, age: Int)")
    }
}

