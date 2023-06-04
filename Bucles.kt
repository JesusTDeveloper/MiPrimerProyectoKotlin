fun main() {
    //Bucles
    println("Cuenta Regresiva:")
    var counter = 10
    while (counter > 0) {
        println(counter)
        counter--
    }

    println("Numeros aleatorios:")
    do {
        val randomNum = (0..100).random()
        println(randomNum)
    }while (randomNum > 50)
}