"""
    Set Collections in Kotlin
    Sets are un-ordered collection of items, they can mutable or readonly
""".trimIndent()


fun main (){
    val readOnlyFruits = setOf("apple", "orange", "cashew")
    val mutableFoods = mutableSetOf("eggs", "milk", "meat")
    println(readOnlyFruits)
    println(mutableFoods)
}

main()