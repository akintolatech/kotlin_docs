//Ex1: Using a when expression, update the following program so that when you input the names of GameBoy buttons,
// the actions are printed to output.

//Ex2: You have a program that counts pizza slices until there’s a whole pizza with 8 slices.
// Refactor this program in two ways:
//(i) using the while statement
//(ii) using the do-while statement

//Ex3: Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
// replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
// Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
//Hint
//Use a for loop to count numbers and a when expression to decide what to print at each step.

fun main () {
    //ex1()
    //ex2()
    ex3()
}

//excersise 1 solution
fun ex1() {

    val button = 'A'

    val action = when (button) {
        'A' -> "Yes"
        'B' -> "No"
        'X' -> "Menu"
        'Y' -> "Quit"
        else -> "Exit"
    }

    println(action)
}

//excersise 2 solution
fun ex2() {
    var pizzaSlices = 1

    while(pizzaSlices <= 8){
        println("there are $pizzaSlices of slices of pizza")
        pizzaSlices++

        if (pizzaSlices == 8){
            println("Complete pizza with $pizzaSlices slices")
        }
    }

}

fun ex3(){
    for( num in 1..100){

        println(
            when {
                num%3 == 0 -> println("fizz")
                else -> num.toString()

            }
        )
    }
}



main()