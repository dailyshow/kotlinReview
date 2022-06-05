fun main(args: Array<String>) {
    var str1: String?
    str1 = null
    val len1 = if(str1 != null) str1.length else -1
    val len2 = str1?.length ?: -1
    println(str1?.length)


}

fun sum(a: Int, b: Int) = a + b
