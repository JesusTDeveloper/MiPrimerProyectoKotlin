fun main() {
    val randomSentence = "En platzi nunca paramos de aprender".randomCase()
    printSentence(randomSentence)
}

//Funciones
fun printSentence(sentence: String) : Unit {
    println("Tu frase es: $sentence")
}

fun String.randomCase(): String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    return if (randomResult.rem(2) == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}