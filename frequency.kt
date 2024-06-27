fun main() {
    val inputString = "Hello, World!"
    val charFrequency = IntArray(26) { 0 }

    for (char in inputString) {
        if (char in 'a'..'z' || char in 'A'..'Z') {
            val index = if (char >= 'a') char - 'a' else char - 'A'
            charFrequency[index]++
        }
    }

    for (i in 0 until 26) {
        val frequency = charFrequency[i]
        if (frequency > 0) {
            val letter = 'a' + i
            println("Frequency of '$letter' is $frequency")
        }
    }
}