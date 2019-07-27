package collection.map

class TestMap {


}

fun main() {
    val map = mapOf<String, String>("name" to "guang", "address" to "shanghai")
    val emptyMap = emptyMap<String, String>()


    println( map["name"])
    println( map["nam"])


}