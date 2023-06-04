fun main() {
    val mobileList = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi a3")
        .run {
            removeIf { mobile -> mobile.contains("Google") }
            this
        }
    println(mobileList)
}