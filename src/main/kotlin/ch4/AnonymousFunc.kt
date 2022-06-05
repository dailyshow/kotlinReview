package ch4

// 익명 함수 : 함수가 이름이 없는 것
fun main() {
//    shortFunc(3, {a -> println("$a")}) // 아래처럼 줄일 수 있음
    inlineFunc(3) {println("$it")}
    noInlineFunc(4) {
        println("$it")
        return@noInlineFunc
    }
}

// 익명함수와 람다식이 매우 흡사하지만 일반 익명 함수와는 다르게
// 람다식에서는 return, break continue 를 사용하기 어렵다. 관련 내용은 위 예제 참조
// 라벨표기법과 같이 사용해야 함
val add = fun (x: Int, y: Int): Int = x + y
val add2 = {x:Int , y:Int -> x + y}


// 인라인 함수 : fun 앞에 inline 키워드를 붙이면 사용 가능
//  - 함수가 호출되는 곳에 내용을 모두 복사
//  - 함수의 분기 없이 처리 -> 성능 증가
//  - 하지만 모든 내용을 복사하기 때문에 너무 큰 함수의 경우에는 코드량이 커져서 오히려 성능에 좋지 않을 수 있음
inline fun inlineFunc(a: Int, out: (Int) -> Unit) {
    println("inline Hello")
    out(a)
}

// noinline : 일부 람다식 함수를 인라인 되지 않게 하기 위해 사용
inline fun noInlineFunc(a: Int, noinline out2: (a: Int) -> Unit) {
    println("noInline Hello")
    out2(a)
    println("noInline Goodbye")
}
