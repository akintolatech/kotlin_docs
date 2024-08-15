"""
   Functions as arguements to other functions
   Notes
    A function is a data type, so you can use it like any other data type. 
    You can pass function to other functions. 
    
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()



val trick = {
    println("Tricked")
}

val treat = {
    println("Treat")
}

//functions as return times
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