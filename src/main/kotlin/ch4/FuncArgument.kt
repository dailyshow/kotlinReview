package ch4

fun main() {
    val result = sum(10, 10)
    val result2 = mul(sum(10, 5), 10)
    val result3 = funcFunc(2, 3)
    println("result : $result, result2 : $result2, result3 : $result3")


    // 람다식 함수를 값으로 호출 하는 방법
    val call = callByValue(lambda())
    println("call : $call")

    // 람다식 이름으로 호출하는 방법
    val call2 = callByName(lambda)
    println("call2 : $call2")
}

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
fun sum(a: Int, b: Int) = a + b // 위의 내용을 한줄로 변경 가능

fun mul(a: Int, b: Int): Int {
    return a * b
}

/*fun funcFunc(a: Int, b: Int): Int {
    return sum(a, b)
}*/
fun funcFunc(a: Int, b: Int) = sum(a, b)



// 값에 의한 호출로 람다식 사용하기
fun callByValue(b: Boolean): Boolean {
    println("값으로 호출")
    return b
}

// 이름에 의한 호출로 람다식 사용
fun callByName(b: () -> Boolean): Boolean {
    println("이름으로 호출")
    return b()
}


val lambda: () -> Boolean = {
    true
}

