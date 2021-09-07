interface PersonProvideInfo{
    fun printInfo(person: Person)

}

  class  BasicInfoProvider: PersonProvideInfo{
      override fun printInfo(person: Person) {
          println("printInfo")
      }
  }


fun main() {
     val provider = BasicInfoProvider()
    provider.printInfo(Person())

}

