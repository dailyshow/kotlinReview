package ch4

fun main() {
    val source = "hello world!"
    val target = "kotlin new world~"
    println(source.getLongString(target))

    // 중위 표현법
//    val multi = 3.multiply(4) // 기존에 사용하는 방식
    val multi = 3 multiply 4 // 중위 표현법으로 사용하는 방식
    println("multi : $multi")

    val myVersion = 2
//    val strPlus = myVersion.strPlus("cis")
    val strPlus = myVersion strPlus "cis"
    println("strPlus : $strPlus")

    // 재귀함수
    val factorial = factorial(4)
    println(factorial)

    // 꼬리 재귀함수
    val num2 = 5
    val factorial2 = factorial2(num2)
    println("factorial2 : $num2 -> $factorial2")
}

// 확장 함수 : 클래스의 멤버 함수를 외부에서 더 추가할 수 있다.
fun String.getLongString(target: String): String = if (this.length > target.length) this else target

// 중위 표현법 : 클래스의 멤버 호출 시 사용하는 점(.)을 생략하고 함수 이름 뒤에 소괄호를 생략해 직관적인 이름을 사용할 수 있는 표현법
// 조건 - 멤버 메서드 또는 확장 함수여야 함
//     - 하나의 매개변수를 가져야 함
//     - infix 키워드를 사용하여 정의함
infix fun Int.multiply(x: Int): Int {
    return this * x
}

infix fun Int.strPlus(x: String): String {
    return "$x version is $this"
}

// 재귀 함수 : 자기 자신을 다시 참조. 잦기 자신을 계속 호출하는 특징
//  - 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둔다.
//  - 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정해 연산하지 않는다.
//  - 코드를 복잡하지 않게 한다.
fun factorial(n: Int): Long {
    println("n : $n")
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}

// 꼬리 재귀 함수(tail recursive function) : 스택에 계속 쌓이는 방식이 아니라 함수가 계속 씌워지는 꼬리를 무는 형태. 코틀린은 tailrec 키워드를 사용.
tailrec fun factorial2(n: Int, run: Int = 1): Long {
    println("n : $n, run : $run")
    return if (n == 1) run.toLong() else factorial2(n - 1, run * n)
}

