fun main() {
    //Control de flujo

    val myInt = 10
    val myString = "cadena de texto"
    if (myInt == 10 && myString == "Hola") {
        println("El valor es 10")
    } else if (myInt == 11 || myString == "Hola") {
        println("El valor es 11")
    } else {
        println("El valor no es ni 10 ni 11")
    }

    val myColor = "Rojo"
    when (myColor) {
        "Rojo", "Red" -> println("$myColor como la pasion")
        "Amarillo", "Yellow" -> println("$myColor como el sol")
        "Azul", "Blue" -> println("$myColor como el mar profundo")
        else -> println("Error, No tengo informacion del color")
    }

    val myCode = 232
    when (myCode) {
        in 200..299 -> println("Codigo valido")
        else -> println("Error, codigo fuera de rango")
    }

    val myShoeSize = 42
    val message = when (myShoeSize) {
        41, 43 -> "Unidades disponibles"
        42, 44 -> "Pocas unidades disponibles"
        45 -> "Sin unidades disponibles"
        else -> "Talla no registrada, tallas registradas: 41, 42, 43, 44 y 45"
    }
    println(message)
}