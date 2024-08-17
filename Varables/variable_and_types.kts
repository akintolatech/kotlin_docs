"""
    Variables and basic types in kotlin
    All rights reserved Akintola Technologies Aug 24
    
""".trimIndent()

fun main(){

    //  variable declaration without initialisation
    val name: String    //immutable
    var sex: Char     //mutable

    //initialisation and assignment
    name = "joe"
    sex = 'M'

    //  explicit declaration and assignment
    val sal: Double = 23.4
    var age: Int = 25

    //  implicit/concise declaration and assignment
    var marital = true


    //  augmented arithmetic assigments
    age+=30
    println("In ${30} years = ${age}")


}



//call the main function
main()