package ch4

fun main() {
    noParam { "hello world!" }

    oneParam { a -> "hello? $a" }
    oneParam { "hello~ $it" } // it 으로 바로 쓸수도 있음. 매개변수가 하나일 경우에만 사용 가능.

    twoParam { p1, p2 -> "two call : $p1, $p2" }
    twoParam { _, p2 -> "two call : $p2"} // 매개변수를 생략할 수도 있음

    withArgs("one", "two", {a, b -> "a : $a, b: $b"}) // 아래처럼 쓸수있음
    withArgs("one", "two"){a, b -> "a : $a, b: $b"}
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("one param"))
}

fun twoParam(out: (String, String) -> String) {
    println(out("two param1", "two param2"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}
