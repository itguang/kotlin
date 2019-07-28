package kotlin中的基本数据类型.集合与数组

/**
 *  只读集合: Collection
 *  可变集合: MutableCollection
 */
fun main() {

    val list = arrayListOf<Int>(1, 2, 3)
    list.add(10)

    val arrayList = ArrayList<String>()
    arrayList.add("itguang")

    println(list.toString())

    println(arrayList.toString())

}

/**
 *  使用只读集合接口和可变集合接口
 */
fun <T> copyElement(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}