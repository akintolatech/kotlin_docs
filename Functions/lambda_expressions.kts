"""
   Lambda functions are used to write functions in a more concise way.
   Within the lambda expression, you write:
   the parameters followed by an ->.
   the function body after the ->.
   In the previous example:
   string is a function parameter.
   string has type String.
   the function returns the result of the .uppercase() function called on string.
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()


//Lanbda function used cases

// lambda expressions can be passed to a function
fun passToAnotherFunction () {

    val numbers = listOf(1, 2, 3 -4, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter {x -> x < 0}
    println("Positive Numbers: ${positives}")
    println("Negative Numbers: ${negatives}")

}

////Lambda expressions can be returned from a function
//fun toSeconds (time : String) : (Int) -> Int = when(time) {
//    "hour" -> { value -> value * 60 * 60 }
//}

fun main () {

    println({string : String -> string.uppercase()}("Ivan"))

    //Lambda expressions can be assigned to a variable
    val lowerCaseString = {string : String -> string.lowercase()}
    println(lowerCaseString("Williams"))

    //function type for upperCaseString() is defined
    //val upperCaseStringtext : (String) - > String = {string -> string.uppercase()}

    passToAnotherFunction()

}




main()