package chap02.section1

import com.example.edu.Person    //다른 패키지에 있는 클래스를 임포트해옴
import kotlin.math.PI   //run했을 때 말풍선이 뜨면 alt+enter누르고 설정
import kotlin.math.abs  //코드 윗부분에 kotlin.math 패키지의 PI와 abs라는 두 요소를 임포트하는 코드가 각각 추가됨


fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println(PI)
    println(abs(-12.6))             //절댓값을 출력하는 abs()함수

    println("intro: $intro, num: $num")

    val user1 = Person("Kildong", 30)     //다른 패키지에서 Person클래스 임포트 해오기

    println(user1.name)
    println(user1.age)
}

