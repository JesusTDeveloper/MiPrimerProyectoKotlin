fun main() {
    val mobileList = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi a3").also {
        list -> println("El valor original de la lista es $list")
    }.asReversed()
    println(mobileList)
}