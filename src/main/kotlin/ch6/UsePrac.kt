package ch6

import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.FileReader
import java.io.PrintWriter

// use() : use 함수를 사용하면 객체를 사용한 후 close() 등을 자동적으로 호출해 줌
// public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R // java 7 이하
// public inline fun <T : AutoCloseable?, R> T.use(block: (T) -> R): R // java 7 이후는 AutoCloseable 로 변경됨
fun main() {
    readFirstLine()
    printWriter()
}

private fun readFirstLine(): String {
    BufferedReader(FileReader("test.file")).use { return it.readLine()}
}

private fun printWriter() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello?")
    }
}
