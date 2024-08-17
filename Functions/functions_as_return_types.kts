"""
   Functions as Return types
   Notes
    A function is a data type, so you can use it like any other data type. 
    You can even return functions from other functions. 
    
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()

val trick = {
    println("Tricked")
}

val treat = {
    println("Treat")
}

//Returning a function from another function
fun trickOrTreat( action: Boolean ): () -> Unit {
    if (action) {
        return treat
    } else {
        return trick
    }
}

//Assign a function directly to a variable
fun main () {
    val trick_var = trickOrTreat(false)
    val treat_var = trickOrTreat(action = true)

    trick_var()
    treat_var()
}

main()