fun main() {
    val name:String = "patrick " //immutable
    var marriageStatus:String? = null
    var height:Int = 23 // mutable
    height=34
when(height){
    null -> println("hey patrick")
    else ->println(height)
}
    println(name)
    println(height)
    println(marriageStatus)
    println(name+height)

}
