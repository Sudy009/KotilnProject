package chap02.section2

fun main() {
    var num: Double = 0.1

    for(x in 0..999){
        num+=0.1
    }

    println(num)
}

//부동 소수점으로 정의된 0.1을 1000번 반복하여 더함
//예상 : 100
//이유 : 부정확한 값 등장O -> 오차에 주의하기