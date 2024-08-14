"""
    Classes in kotlin
    All rights reserved Akintola tecnologies APR 24
""".trimIndent()

//default constructors
class SmartDevice {

    //class properties
    val name = "Smart Tv"
    val category = "Security"
    val status = 0

    //class methods
    fun turnOn(){
        println("Turned on")
    }

    fun turnOff(){
        println("Turned on")
    }
}

fun main(){
    //class instatiation
    val smartTv = SmartDevice()
    smartTv.turnOn()
    //calling class methods
    println("The name of the smart device is: ${smartTv.name}")
}

main()