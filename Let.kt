fun main() {
    var name : String? = null
    name?.let {
        value -> println("El nombre no es nulo, es $value")
    }
    name = "Jesus"
    name?.let {
            value -> println("El nombre no es nulo, es $value")
    }
}