fun hello () {
    return println("Hello World")
}

//functiions with parameters
fun sum (x: Int, y: Int): Int {
    return x + y
}

fun printUserDetials ( sex: String, name: String): String {
    var prefix = when {
        sex == "M" -> "Mr"
        sex == "F" -> "Mrs"
        else -> "Bi"
    }
    val msg: String = "Welcome ${prefix}. ${name}"

    return msg
}

fun main () {
    hello()
    println(sum(67, 78))
    println(printUserDetials("M", "Ivan Williams"))

}

main()