fun main() {
    //Sets
    val repeatedVowels = setOf("a","e","i","o","u","a","e","i","o","u")
    println(repeatedVowels)

    val repeatedNumbers = mutableSetOf(1,2,3,4)
    println(repeatedNumbers)
    repeatedNumbers.add(5)
    println(repeatedNumbers)

    repeatedNumbers.remove(5)
    println(repeatedNumbers)

    val setValue: Int? = repeatedNumbers.firstOrNull { number -> number > 2 }
    println(setValue)
}