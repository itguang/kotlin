package chapter_4.abs

open class Person() {
    constructor(name: String, age: Int) : this() {
        println("Person 次构造方法")
    }

    open fun work(job: String) {
        println("在工作...$job")
    }
}