fun main() {
    //Listas
    val nameList = listOf("Juan","Camila", "Sergio")
    println(nameList)

    val emptyList = mutableListOf<String>()
    println(emptyList)

    emptyList.add("Tulio")
    println(emptyList)

    val valueUsingGet = emptyList.get(0)
    println(valueUsingGet)

    val valueUsingOperator = emptyList[0]
    println(valueUsingOperator)

    val firstValue:String? = nameList.firstOrNull()
    println(firstValue)

    emptyList.removeAt(0)
    println(emptyList)

    emptyList.add("Pepe")
    println(emptyList)
    emptyList.removeIf { characters -> characters.length > 3 }
    println(emptyList)

    val myArray = arrayOf(1,2,3,4)
    println("Mi array: $myArray")
    println("Array como lista: ${myArray.toList()}")

    val lotteryNumber = listOf(11,22,43,56,78,66)
    val  sortedNumbers = lotteryNumber.sorted()
    println(sortedNumbers)

    val descendantLotteryNumbers = lotteryNumber.sortedDescending()
    println(descendantLotteryNumbers)

    val sortByMultipliers = lotteryNumber.sortedBy { number -> number < 50 }
    println(sortByMultipliers)

    val randomNumbers = lotteryNumber.shuffled()
    println(randomNumbers)

    val reverseNumbers = lotteryNumber.reversed()
    println(reverseNumbers)

    val numberMessage = lotteryNumber.map { number -> "Tu numero de loteria es $number" }
    println(numberMessage)

    val filteredNumbers = lotteryNumber.filter { number -> number > 50 }
    println(filteredNumbers)
}