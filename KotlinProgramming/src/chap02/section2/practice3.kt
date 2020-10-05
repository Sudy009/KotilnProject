package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"    //문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")
}

//개념
//var a = 1
//var s1 = "a is $a"   //String 자료형의 s1을 선언하고 초기화. 변수 a가 사용됨