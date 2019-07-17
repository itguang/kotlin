package chapter_4.abs

class Student(val name: String, val age: Int) : Person(name, age = 0) {

    override fun work(job: String) {
        println("学生 ${name} 在 $job ")
    }
}