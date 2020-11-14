interface PersonInfoProvider {
    fun personDetail(person: Person)

}

class  BasicInfo :PersonInfoProvider{

    init {
        //this.personDetail(Person("Shah","Poran",23,this))
      val person=  Person("Shah","Poran",23,this)
        person.nickName="poran"
    }

    override fun personDetail(person: Person) {

        println("Person details :${Person.personInfo(person)}")

    }

}

fun main(){
    val  basicInf=BasicInfo()
}