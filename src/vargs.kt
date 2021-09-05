fun sayHello(greeting:String,itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet" )
        }
}
fun main() {
    val interestingThings= listOf("kotlin","programming","comic books")
    sayHello("hi",interestingThings)
    
}