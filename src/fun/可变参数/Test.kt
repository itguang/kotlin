package `fun`.可变参数

class Test {
    // 可变数量的参数
    fun <T> asList(vararg ts: T): List<T> {
        val arrayList = ArrayList<T>()
        for (t in ts) {
            arrayList.add(t)
        }
        return arrayList
    }
}

fun main() {
    val list = Test().asList(1, 2, 3)
    println(list.toString())
}