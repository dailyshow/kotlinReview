package ch6

// let() 함수 : let 함수는 함수를 호출하는 객체 T 를 이어지는 block의 인자로 넘기고 block 의 결과값 R 을 반환함
fun main() {
    val score: Int? = null
//    val score: Int? = 32

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("score : $score")
        }
    }

    // let 을 사용해 null 검사
    // let 을 이용하면 null 검사를 편하게 할 수 있다.
    // 하지만 자바로 디컴파일 하면 결과적으로는 if 안에서 null 인지 체크하는것과 같기 때문에 굳이 let 을 이용해서 검사할 필요 없음.
    fun checkScoreLet() {
        score?.let { println("score : $it") } ?: println("score 는 null 이당")
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()


    var a = 1
    val b = 2
    a = a.let { it + 2 }.let {
        println("a = $a")
        val i = it + b
        i
    }
    println(a)

    // 중첩 사용할 때는 내부에 있는것 둘 다 반환 되지만, 바깥에 있는것만 할당 되어 있는것은 바깥에 있는 것만 반환됨
    var x = "kotlin!"
    x.let { outer ->
        outer.let { inner ->
            println("inner is $inner and outer is $outer")
        }
    }

    x = x.let { outer ->
        outer.let { inner ->
            println("inner is $inner and outer is $outer")
            "Inner String"
        }
        "Outer String" // outer 에서 리턴값을 선언하지 않으면 inner 에서 선언한 Inner String 이 리턴 됨
    }
    println(x)
}
