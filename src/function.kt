fun getGreeting():String{
    return "hello kotlin"
}
// single function expression
fun getUserAge():Int =24
// removing the int
fun getMarriageStatus()="single"
fun sayHello():String?{ // returns a nullable value
    return null

}
fun main() {
    // function invocations
    println(getGreeting())
    println(sayHello())
    println(getUserAge())
    println(getMarriageStatus())

}