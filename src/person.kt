class Person(val firstName:String, val lastName:String){

init {
    println("init 1 ")
}
// second constructor that does not  take parameters
    constructor():this("patty","pater"){
    println("secondary constructor")

}
    init{
        println("init 2")
    }
}
