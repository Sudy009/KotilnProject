@file:JvmName("PersonKt")

package chap02.section1

import com.example.edu.Person as User     //다른 패키지의 클래스 이름을 User로 대체

fun main() {
    val user1 = User("Kildong", 30)          //com.example.edu의 Person이 User로 대체
    val user2 = UserClassImport("A123", "Kildong")     //이 파일 안에 있는 Person 클래스의 객체 생성

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class UserClassImport(val id: String, val name: String)
//책에서는 Class라 표현했지만 내가 같은 패키지에 Person 클래스를 추가해놔서 충돌이 일어남->클래스 이름 바꿈
