fun main() {
    printName(name = "Jesus", surname = "Torres")
}

fun printName(name : String, middleName : String = "", surname : String) {
    println("Mi nombre es $name $middleName $surname")
}