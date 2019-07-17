package chapter_4

class Runoob(name: String) {

    var url:String = "http://www.xr.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名称: ${name}")
    }

    fun open(){
        println("打开网址: $url")
    }

}
