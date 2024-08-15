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

fun trickOrTreat( action: Boolean ): () -> Unit {
    if (action) {
        return treat
    } else {
        return trick
    }
}

fun main () {
    val trick_var = trickOrTreat(false)
    val treat_var = trickOrTreat(action = true)

    trick_var()
    treat_var()
}

main()