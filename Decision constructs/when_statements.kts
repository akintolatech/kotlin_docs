fun main(){
    val salary = 3000

    when (salary){
        2000 -> println("Lower management")
        3000 -> println("Upper management")
        //multiple conditions
        500,1000 -> println("IT Students")
        else -> println("CEO")
    }

    val trafficLight = "yellow"

    when(trafficLight){

        "red" -> println("Stop")
        "yellow" -> println("wait")
        "green" -> println("Go")
        else -> println("Invalid")

    }

    //When statements as expressions
    val temp = 18

    val description = when {
        temp < 3 -> "very cold, you are in antartica?"
        temp < 10 -> "moderately cold"
        temp < 20 -> "warm"
        else -> "hot, nigeria temperature"
    }

    println(description)
}

main()