package chapter_4.abs

class Teacher : Person {
    var name: String
    var age: Int

    // 子类没有主构造函数,必须调用基类 的构造函数
    constructor(name: String, age: Int) : super() {
        this.name = name
        this.age = age
        println("子类没有主构造函数,必须调用基类 的主构造函数")
    }

    override fun work(job: String) {
        println("老师 $name 在 $job")
    }
}