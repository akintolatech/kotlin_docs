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

fun main () {
    println(circleArea(5))
}

main()

