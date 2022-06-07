package ch6

// with() : with 함수는 인자로 받는 객체를 이어지는 block 의 receiver 로 전달하며 결과값을 반환
// - run 함수와 기능이 거으이 동일한데, run 의 경우 receiver 가 없지만 with 에서는 receiver 로 전달할 객체를 처리
// public inline fun <T, R> with(receiver: T, block: T.() -> R): R  = receiver.block()
fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")

    val result = with(person) {
        name = "cis"
        skills = "java"
    }
    println(person)
    println("result : $result" )
}
