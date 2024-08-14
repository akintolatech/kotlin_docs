fun main() {
    var favoritecolor: String = "purple"
    println("Color Length: ${favoritecolor.length}")

    //To declare nullable variables in Kotlin, you need to add a ? operator to the end of the type
    var favoriteActor: String? = "James Bond"
    println(favoriteActor)

    //null variable reassignment
    favoriteActor = null

    //acessing properties of nullable variables directly is not allowed, use the safe call (?.) operator instead
    println("Actor Length: ${favoriteActor?.length}")

    notnull()

    conditionalNullCheck()
}

// not null insertion pointer; not to be used if non nullable value
fun notnull (){
//    var favFood: String? = null
//
//    println("Food length" {favFood!!.length})
    println("testing")

}

fun conditionalNullCheck(){

    var favCity: String? = "Jos"
//    favCity = null

    if (favCity != null){
        println("City length: ${favCity.length}")
    }else{
        // using the safe call operator to handle nullable types
        println("City length Null: ${favCity?.length}")
    }
    //method/property access using the not null insertion pointer

}

main()

