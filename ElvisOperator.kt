fun main() {
    //Elvis Operator
    var myName: String? = null
    val nameCharacters: Int = myName?.length ?: 0
    println(nameCharacters)
}