fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
fun main(){
    val result = max(2, 12)
    println(result) // prints 10
}