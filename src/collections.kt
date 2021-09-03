fun helloworld(greeting:String,itemToGreet:String) = println("$greeting $itemToGreet" )
fun main() {
    val interestingThings= arrayOf("kotlin","programming","comic books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    //iterate the array and print the values
    for (i in interestingThings) {
        println(i)
    }
    // functional approach to iteration in arrays
     interestingThings.forEach{ i ->  // lambda syntax
  println(i)
     }
    // indexed for each
    interestingThings.forEachIndexed{  index,i -> println("$i is index $index")}

    // map
    val map=mapOf(1 to 'a',2 to 'b',3 to 'c',4 to 'd')
     map.forEach{ (key, value) ->println("$key -> $value ")}
    // collection is immutable by default
    // collection mutable
    val interestingStuff=mutableSetOf("kotlin ","programming","comic books")
    interestingStuff.add("food")
    interestingStuff.forEach { i -> println("$i") }



}