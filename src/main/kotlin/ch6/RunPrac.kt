package ch6

// run() : run 함수는 인자가 없는 익명 함수처럼 동작하는 형태와 객체에서 호출하는 형태 두 가지로 사용
fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")

    val returnObj = person.run {
        this.name = "cis"
        this.skills = "kotlin"
        "success" // 마지막 줄이 리턴됨
    }
    println(person)
    println(returnObj)

    // 다른 예
    val a = 10
    val skills = run {
        val level = "kotlin level : $a"
        level
    }
    println(skills)

    // null check
    val myObj: String? = null
    val obj = myObj?.run {
        "myObj는 null 아님"
    } ?: "myObj 는 null 임"
    println(obj)
}


