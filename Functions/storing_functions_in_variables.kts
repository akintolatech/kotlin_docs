"""
   Storing Functions in variables
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()

fun trick () {
    println("Tricked")
}

fun main () {
    //refer to the function using the fuction reference operator ::
    var fun_var = ::trick

    var funvar2 = { println("tricked") }
}

main()