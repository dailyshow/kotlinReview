package ch6

import kotlin.random.Random
import kotlin.system.measureTimeMillis

// takeIf() : takeIf 함수는 람다식이 true 이면 결과를 반환
// takeUnless() : takeUnless 함수는 람다식이 false 이면 결과를 반환
// public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T?
//    = if (predicate(this)) this else null
fun main() {
    val input = "kotlin"
    val keyword = "in"

    input.indexOf(keyword).takeIf { it > 0 } ?: error("keyword not found")
    input.indexOf(keyword).takeUnless { it < 0 } ?: error("keyword not found")

    // measureTimeMillis(), measureNanoTime() : 시간 측정
    var sum = 0
    val executionTime = measureTimeMillis {
        for (i in 0..100000) {
            sum += i
        }
        println("sum : $sum")
    }
    println("executionTime : $executionTime")

    // 난수 생성
    // 자바의 random(java.util.Random) 이 아니라 코틀린 랜덤(kotlin.random.Random)을 사용
    val number = Random.nextInt(21)
    println(number)
}




