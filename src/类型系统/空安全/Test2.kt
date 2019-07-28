package 类型系统.空安全

/**
 *   name?.let   语法 : 对一个可空值运用一个函数
 */
fun main() {
    var email: String? = null
    // sendEmail 函数接受非空参数
//    sendEmailTo(email)

    // 不会执行
    canSendEmailTo(email)
    // 会执行
    canSendEmailTo("itguang@22.com")
    email?.let { println("send to $it") }

    // 会执行
    getName(666)?.let { println("name is $it") }
    // 不会执行
    getName(-1)?.let { println("name is $it") }

    // 第一个可空属性强制 不为空调用
    println(email!!.length)


}


fun sendEmailTo(email: String) {
    println("send to $email")
}

fun canSendEmailTo(email: String?) {
    email?.let { println("send to $it") }
}

fun getName(id: Int): String? {
    if (id < 0) {
        return null
    }
    return id.toString()
}
