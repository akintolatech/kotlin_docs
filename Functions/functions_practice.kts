import kotlin.math.PI

"""
    Write a function called circleArea that takes the radius of a circle in integer format 
    as a parameter and outputs the area of that circle.
    
""".trimIndent()

//import kotlin.math.PI

fun circleArea (r : Int ): Double {
    val area = PI * r * r
    return area
}

"""
   Rewrite the circleArea function from the previous exercise as a single-expression function.
    
""".trimIndent()

//as a single expression
fun circleAreaX (r:Int): Double = PI * r * r

fun main () {
    println(circleArea(5))
    println(circleAreaX(70))
}

main()

