class Person(val firstName:String="peter", val lastName:String = "parker"){
      var nickName:String? = null
         set(value) {
             field = value
             println("The new nickname is $value")

         }
    get() {
        println("The returned value is $field")
        return field
    }
    fun personInfo(){
        val nicknameToPrint = nickName ?: "no nickname"
        println("$firstName ($nicknameToPrint) $lastName")
    }




}
