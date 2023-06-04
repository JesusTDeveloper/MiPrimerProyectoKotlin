fun main() {
    //Ciclos
    val fruitList: List<String> = listOf("Manzana", "Mandarina", "Banana", "Uva")
    println("Ingredientes para mi ensalada de fruta")
    for (fruit in fruitList) {
        println(fruit)
    }
    fruitList.forEach { fruit -> println(fruit)}

    val fruitCharacters: List<Int> = fruitList.map { fruit -> fruit.length }
    println(fruitCharacters)

    val filteredFruitList = fruitCharacters.filter { fruitLength -> fruitLength > 5 }
    println(filteredFruitList)
}