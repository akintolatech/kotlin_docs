"""
    Map Collections in Kotlin
    Maps are key to values structures
""".trimIndent()

fun main() {

    val staffAndSalary = mutableMapOf(
        "adam" to 5000,
        "eve" to 3000
    )

    println("The first staff salary is: ${staffAndSalary["adam"]}")
    println("The number of items in the dictionary is ${staffAndSalary.count()}")

//    add item to the map
    staffAndSalary.put("abel", 2000)
    println(staffAndSalary)

//    print all keys
    println("All keys: ${staffAndSalary.keys}")

//    all values
    println("All Values: ${staffAndSalary.values}")


}

main()