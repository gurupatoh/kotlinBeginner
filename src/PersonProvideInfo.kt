interface PersonProvideInfo{
    val provideInfo:String
    fun printInfo(person: Person){
        println(provideInfo)
        person.personInfo()
    }

}
interface sessionInterfaceProvider {
    fun getSesssionId():String
    

}

class  BasicInfoProvider: PersonProvideInfo,sessionInterfaceProvider{
    override val provideInfo: String
        get() = "BasicInformProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("print additional information")
    }

    override fun getSesssionId(): String {
        return "Session"
    }

}



fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSesssionId()
    checkTypes(provider)

}
fun  checkTypes(infoProvider: PersonProvideInfo){
    if (infoProvider !is  sessionInterfaceProvider){
        println("not a session info provider")


    }
    else{
        println("is a session info provider")

    }

}
