package ch4

var global = 10

fun main() {

    // localFunc1() // 지역함수는 선언이 먼저 되어야만 호출 가능함

    fun localFunc1() {
        println("localFunc1")
    }

    localFunc1()

    global = 15
    val local1 = 15
    println("global $global")
    userFunc()
    println("final - global : $global, local1 : $local1")
}

fun userFunc() {
    global = 20
    val local1 = 20
    println("global $global, local1 : $local1")
}
