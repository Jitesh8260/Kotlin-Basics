fun main() {
    val num1 = 24
    val num2 = 36

    var gcd = 1
    var smaller = if (num1 < num2) num1 else num2

    for (i in 1..smaller) {
        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i
        }
    }

    println("The Greatest Common Divisor of $num1 and $num2 is $gcd")
}