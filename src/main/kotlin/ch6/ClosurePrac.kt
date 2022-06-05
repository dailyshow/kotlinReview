package ch6

// 클로저 : 람다식으로 표현된 내부 함수에서 외부 범위에 선언된 변수에 접근할 수 있는 개념. 람다식 안에 있는 외부 변수는 값을 유지하기 위해 람다가 포획한 변수
fun main() {
    val calc = Calc()
    var result = 0 // 외부의 변수
    calc.addNum(2, 3) {x, y -> result = x + y} // 클로저
    println(result) // 값을 유지하여 5가 출력

    // 함수의 매개변수에 접근
    fun filteredNames(length: Int): List<String> {
        val names = arrayListOf<String>("kim", "hong", "go", "hwang", "jeon")
        val filterResult = names.filter {
            it.length == length
        }
        println(filterResult)
        return filterResult
    }

    val f = filteredNames(4)
    f.forEach {
        println(it)
    }
//    println(f)
}

class Calc{
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}
