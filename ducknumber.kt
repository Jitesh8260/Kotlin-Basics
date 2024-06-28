fun main() {
    val number = 3210
    var isDuckNumber = false
    var temp = number

    while (temp > 0) {
        val digit = temp % 10
        if (digit == 0) {
            isDuckNumber = true
            break
        }
        temp /= 10
    }

    if (isDuckNumber) {
        println("$number is a Duck Number")
    } else {
        println("$number is not a Duck Number")
    }
}
