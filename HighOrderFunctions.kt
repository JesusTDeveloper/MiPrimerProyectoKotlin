fun main() {
    val startingValueLength = superFunction(startingValue = "Hola!") { value ->
        value.length
    }
    println(startingValueLength)

    val lambda: () -> String = inceptionFunction("Saito")
    val valueLambda: String = lambda()
    println(valueLambda)
}

fun superFunction(startingValue : String, block : (String) -> Int) : Int {
    return  block(startingValue)
}

fun inceptionFunction(name : String) : () -> String {
    return {
        "Hola desde la lambda $name"
    }
}