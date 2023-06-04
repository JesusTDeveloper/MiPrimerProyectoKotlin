fun main() {
    //Maps
    val ageOfPeople = mapOf(
        "Raul" to 35,
        "Georgina" to 23,
        "Thomas" to 27,
        "William" to 86
    )
    println(ageOfPeople)

    val mutableAgeOfPeople = mutableMapOf(
        "Raul" to 35,
        "Georgina" to 23,
        "Thomas" to 27,
        "William" to 86
    )
    println(mutableAgeOfPeople)

    mutableAgeOfPeople.put("Dayana",40)
    println(mutableAgeOfPeople)

    mutableAgeOfPeople["Catrina"] = 30
    println(mutableAgeOfPeople)

    val raulAge = mutableAgeOfPeople["Raul"]
    println(raulAge)

    mutableAgeOfPeople.remove("Dayana")
    println(mutableAgeOfPeople)

    println(mutableAgeOfPeople.keys)
    println(mutableAgeOfPeople.values)
}