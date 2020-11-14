  class Person(val firstName:String, val lastName:String, val age :Int) {
    /*val firstName:String = _firstName
    val lastName:String = _lastName
    val age:Int = _age*/
      constructor( firstName:String,  lastName:String,  age :Int,   infoProvider:PersonInfoProvider):this(firstName,lastName,age){
        infoProvider.personDetail(this)
    }
      private lateinit var  infoProvider:PersonInfoProvider

     var nickName:String?=null
        set(value) {
            field = value
            println("set nickName $field")
        }
        get() {
            println("get nickName $field")
            return field

        }
   var birthDate:String?=null
    set(value) {
        field = value
        println("set birthdate $field")
    }
    get() {
        println("get birthdate $field")
        return field
    }

    fun personInfo()= println("FirstName $firstName lastName $lastName nickName ${nickName?:"no nickName"}")

      companion object {
          fun personInfo(person: Person):String {
              return "FirstName ${person.firstName} lastName ${person.lastName} nickName ${person.nickName ?:"no nickName"}"
          }
      }


  }