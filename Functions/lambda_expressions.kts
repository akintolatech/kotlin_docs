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

fun passToAnotherFunction () {

    val numbers = listOf(1, 2, 3 -4, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter {x -> x < 0}
    println("Positive Numbers: ${positives}")
    print("Negative Numbers: ${positives}")

}

fun main () {

    println({string : String -> string.uppercase()}("Ivan"))

    //Assigning to a variable
    val upperCaseString = {string : String -> string.lowercase()}
    println(upperCaseString("Williams"))

    passToAnotherFunction()

}




main()