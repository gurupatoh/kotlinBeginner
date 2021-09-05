fun sayHello(greeting:String,vararg itemsToGreet: String) {
    // vararg is used as an array the user specified
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet" )
    }
}
fun main() {
    val interestingThings= listOf("kotlin","programming","comic books")
    sayHello("hi","kotlin","programming","comic")

}