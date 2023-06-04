fun main() {
    val myLambda : (String) -> Int = { value -> value.length }
    val lambdaExecuted = myLambda("Hello Everyone")
    println(lambdaExecuted)

    val greetings = listOf("Hello","Hola","Ciao")
    val greetingsLength = greetings.map(myLambda)
    println(greetingsLength)
}