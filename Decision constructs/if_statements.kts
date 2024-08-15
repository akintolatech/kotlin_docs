"""
    
""".trimIndent()

"""
   Conditional statements statements
   Notes
    if else, if else if statements in Kotlin
    if statementes are used for decision making
   All rights reserved Akintola Technologies Aug 24    
""".trimIndent()

fun main(){

    val color = "black"

    if (color == "red"){
        println("The traffic is $color, stop your vehicle")
    }else if (color == "yellow"){
        println("Wait")
    }else if (color == "green") {
        println("Go")
    }else{
        println("Invalid")
    }

    //if statements as expressions
    val message = if (color == "red"){println("Stop")}else{println("Not relates")}
    print(message)
}



main()