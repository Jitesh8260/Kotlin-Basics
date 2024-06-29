fun Palindrome(s: String): Boolean {
    var i = 0
    var j = s.length - 1

    while (i < j) {
        if (s[i] != s[j]) {
            return false
        }
        i++
        j--
    }
    return true
}
fun main() {
    println(Palindrome("madam")) 
}