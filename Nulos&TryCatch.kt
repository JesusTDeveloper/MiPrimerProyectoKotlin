fun main() {
    //Nulos
    var myNull: String? = null

    //Try Catch
    try {
        throw NullPointerException("Referencia nula")
        myNull!!.length
    } catch (exception : NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Ha ocurrido un error... Cerrando aplicacion")
    }

    val value1 = 10
    val value2 = 0
    val result: Int = try { value1 / value2 } catch (exception : Exception) { 0 }
    println(result)
}