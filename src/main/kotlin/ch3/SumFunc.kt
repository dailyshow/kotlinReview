package ch3

fun main() {
    val result1 = sum(2)
    val result2 = sum(2, 5)
    println(result1)
    println(result2)

    sum2(1, 2, 3, 4, 5)

    // test
    val result = avgFunc(5f, 100f, 90f, 80f)  // 첫번째 인자: 초기값, 이후 인자는 가변인자
    println("avg result: $result")
}

fun sum(a: Int, b: Int = 2): Int { // 매개변수에 기본값을 지정할 수 있음
    return a + b
}

fun sum1(a: Int, b: Int) : Int = a + b

fun sum2(vararg a: Int) {
    for (num in a) {
        println(num)
    }
}

fun avgFunc(initial: Float, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = initial + result
    return avg.toDouble()
}
