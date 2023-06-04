fun main() {
    val mobileList = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi a3").apply {
        removeIf { mobile -> mobile.contains("Google") }
    }
    println(mobileList)

    val colors : MutableList<String>? = mutableListOf("Amarillo","Azul","Rojo")
    colors?.apply {
        println("Nuestros colores son $this")
        println("Esta lista tiene $size colores")
    }
}