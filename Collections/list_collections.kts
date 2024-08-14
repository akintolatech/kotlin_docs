"""
    List Collections in Kotlin
    List are ordered collection of items, they can mutable or readonly
""".trimIndent()


fun main(){

    // implicit list declaration
    val salary = listOf(2000, 1000, 500)        //read ony - immutable
    val staffs = mutableListOf("joe", "sam", "ana")       //mutable

    //explicit list type declaration
    var dept: MutableList<String> = mutableListOf("research", "project")

    println("The Total number of staffs is ${staffs.count()}")
    //explicit declaration
    //prevent unwanted modifications, you can obtain read-only views of mutable lists by assigning them to a List:
    val rank: MutableList<String> = mutableListOf("Cpl", "Lcpl", "ACM")
    //    val lockedRanks : List<String> = rank
    //standard output
    println(staffs)

    //indexed acess operator
    println("The first staff is ${staffs[0]}")

    //list operations
    //the first and last items in the list can be accessed with the first() and last() functions respectively
    println("The first item in the list is: ${salary.first()}")
    println("The last item in the salary list collection is ${salary.last()} ")

    //to check if an item is in a list use the in operator
    //print("ACM" in lockedRanks)

    //determing the total number of items in a list
    val total = staffs.count()
    println("The total number of staffs is $total")

    //adding and removing items in a list

    //add abel to staffs
    staffs.add("Abel")
    print("The updated staffs are $staffs\n")

    //remove
    staffs.remove("Eve")
    print("The updated staffs after removal $staffs")

}

main()






