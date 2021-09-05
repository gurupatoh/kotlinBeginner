fun sayhi(greeting:String,vararg itemsToGreet: String) {
    // vararg is used as an array the user specified
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet" )
    }
}
// named arguments
fun greetPerson(greeting:String="hello",name:String="username")=println("$greeting $name")

fun main() {
    val interestingThings= arrayOf("kotlin","programming","comic books")
    sayhi(greeting = "hi", *interestingThings)
}