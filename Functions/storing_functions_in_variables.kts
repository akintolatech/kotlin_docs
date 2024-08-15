"""
   Storing Functions in variables
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()

fun trick () {
    println("Tricked with function reference")
}

fun main () {
    //refer to the function using the fuction reference operator ::
    var fun_var = ::trick

    //using labda expressions
    var funvar2 = { println("Tricked with lambda") }

    //call the functions
    fun_var()
    funvar2()
}

main()