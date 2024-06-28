fun main() {
    val number = 1634
    var temp = number
    var numDigits = 0
    var n = number

    while (n != 0) {
        n /= 10
        numDigits++
    } 

    var sum = 0
    n = number
    while (n != 0) {
        val digit = n % 10
        var product = 1
        for (i in 1..numDigits) {
            product *= digit
        }
        sum += product
        n /= 10
    }

    if (sum == number) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}
