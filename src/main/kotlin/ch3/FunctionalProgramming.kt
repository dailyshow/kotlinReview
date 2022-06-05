package ch3

class FunctionalProgramming {

}
// 순수 함수 : 동일한 입력 인자에 대해서는 항상 같은 결과를 출력 혹은 반환한다.
// 순수 함수가 아닌 것은? : 함수의 실행 결과가 항상 같은 결과로 나오지 않는 함수
// ex)
// fun  check() {
//      val test = User.grade()        // check() 함수에 없는 외부의 User 객체를 사용
//      if(test != null) process(test) // 변수 test 는 User.grade() 의 실행 결과에 따라 달라짐
// }

// 순수함수를 사용해야 하는 이유?
// 입력과 내용을 분리하고 모듈화 하므로 재사용성이 높아진다.
// - 여러가지 함수들과 조합해도 부작용이 없다.
// 특정 상태에 영향을 주지 않으므로 병행 작업 시 안전하다.
// 함수의 값을 추적하고 예측 할 수 있기때문에 테스트, 디버깅 등이 유리하다.

// 일급 객체란?
// 일급 객체는 함수의 인자로 전달할 수 있다.
// 일급 객체는 함수의 반환값에 사용할 수 있다.
// 일급 객체는 변수에 담을 수 있다.
// 코틀린에서 함수는 1급 객체로 다룸
// 1급 함수라고도 함

// 고차 함수
// 함수 안에 함수를 사용할 수 있음.
// ex)
// fum main() {
//    println(highFunc({x, y} -> {x + y}, 10, 20))
// }

// fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a + b) 또는 아래처럼 사용할수도 있음
// fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
//    return sum(a + b)
// }

fun main() {
    val result = highFunc(1, 3, {x, y -> x + y})
    // 호출하는 함수의 매개변수들 중 람다식이 가장 뒤에 오면 위의 내용을 아래처럼 변경할 수도 있음
    val result2 = highFunc(1, 3) {x, y ->
        x + y
    }
    println(result)
    println(result2)
}

fun highFunc(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

