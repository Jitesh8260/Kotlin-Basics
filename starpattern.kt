fun main() {
    var n = 5 // number of rows

    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ") // print spaces for indentation
        }
        for (k in 1..i) {
            print("* ")
        println()
    }
    n  = 5 // number of rows

    for (i in n downTo 1) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("* ")
        }
        println()
    }
}
