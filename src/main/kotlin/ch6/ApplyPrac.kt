package ch6

// apply() : apply 함수는 also() 함수와 마찬가지로 호출하는 객체 T 를 이어지는 block 으로 전달하고 객체 자체인 this 를 반환
fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "kotlin")
    println(person)

    person.apply {
        this.skills = "swift"
    }

    val returnObj = person.apply {
        name = "cis"
        skills = "dart"
    }
    println(person)
    println(returnObj)
}
