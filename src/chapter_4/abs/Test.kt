package chapter_4.abs

fun main() {
    val student = Student("杏仁",10)

    println("Student name = ${student.name}")
    println("Student age = ${student.age}")
    student.work("学习")

    val teacher = Teacher("琦玉",25)

    teacher.work("打架")

}