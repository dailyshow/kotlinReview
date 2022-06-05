package ch6

// also() 함수 : 함수를 호출하는 객체 T 를 이어지는 block 에 전달하고 객체 T 자체를 반환
fun main() {
    var m = 1
    m = m.also { it + 3 }
    println(m) // also 는 계산한 값을 반환하지 않고 원본 값을 반환

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")

    println("---------- let ----------")
    val a = person.let {
        it.skills = "android"
        "success"
    }
    println(person)
    println("a : $a")
    println("---------- also ----------")
    val b = person.also {
        it.skills = "ios"
        "success" // 사용되지않음. also 는 let 과 다름
    }
    println(person)
    println("b : $b")
}
