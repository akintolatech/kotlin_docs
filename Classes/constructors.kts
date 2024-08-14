"""
    Classes in kotlin
    All rights reserved Akintola tecnologies APR 24
""".trimIndent()

//parameterized construcctors
class SmartDevice (val name: String, val category: String) {

    //class properties
    //val name = "Smart Tv"
    //val status = 0

    //secondary constructors
    constructor(name: String, category: String, statusCode: Int): this ( name: String, category: String ){
        //initiation logic
        deviceStatus = when(statusCode){
            0 -> "offline"
            1 -> "online"
            else - > "Unknown"
        }
    }

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
    val smartTv = SmartDevice("Android TV", "electronics")
    smartTv.turnOn()
    //calling class methods
    println("The name of the smart device is: ${smartTv.name}")
}

main()