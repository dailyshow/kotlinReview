package ch3

fun main() {
    val result: Int

//    val multi = { a: Int, b: Int -> a * b }
//    val multi: (a: Int, b: Int) -> Int = { a, b -> a * b }
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        print("$a, $b")
        a * b  // 마지막 값이 반환값이 된다.
    }

    result = multi(10, 20)
    println(result)

    val greet: () -> Unit = {println("hello??")}
    val greet2 = {println("hello??")}
    val square = { x:Int, y:Int -> x * y }
    // 람다식 안에 람다식을 넣을수도 있다.
    val nestedLambda: ()->()->Unit = { { println("nestedLambda") } }
}


