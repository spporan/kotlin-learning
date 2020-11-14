class Person(_firstName:String,_lastName:String ,_age :Int) {
    val firstName:String = _firstName
    val lastName:String = _lastName
    val age:Int = _age
    init {
        println("called init")
    }

    constructor ():this("poran","Shah",12){
        print("called secondary constructor")
    }

    init {
        println("called init 2")

    }
}