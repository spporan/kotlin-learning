interface PersonInfoProvider {
    var personInfo:String
    fun personDetail(person: Person){
        println("person info $personInfo")
        person.personInfo()
    }

}

interface SessionProvider{

    fun sessionId()
}

class  BasicInfo :PersonInfoProvider,SessionProvider{

    override var personInfo: String
        get() = "Default implementation"
        set(value) {}

    init {
        //this.personDetail(Person("Shah","Poran",23,this))

      val person=  Person("Shah","Poran",23,this)
        person.nickName="poran"
    }

    override fun personDetail(person: Person) {
        super.personDetail(person)
        println("Person details :${Person.personInfo(person)}")

    }

    override fun sessionId() {
        println("Session id")
    }

}

fun main(){
    val  basicInf=BasicInfo()
    checkProvider(basicInf)
}

fun checkProvider(infoProvider: PersonInfoProvider) {
    /*if(infoProvider is SessionProvider) println("This session provider")

    else println("This not provider")*/

    when(infoProvider){
        !is SessionProvider ->println("This not SessionProvider")
        else ->
        {
            println("This SessionProvider")
            infoProvider.sessionId()
        }

    }
}