"""
   Functions as Datatype
   Notes
    kotlin type inference also infers functions, meaning you can define functions in a concise manner
    without worrying to explicitly define its type.
    When a function doesn't return anything its type is Unit.
    
    
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()

fun main () {

    //explicitly defining a lambda function as a variable explicitly defining its type.
    val treat :() -> Unit = {
        println("Treated!")
    }

    //call the function
    treat()
}

main()