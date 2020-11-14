class Person(_firstName:String,_lastName:String ,_age :Int) {
    /*val firstName:String = _firstName
    val lastName:String = _lastName
    val age:Int = _age*/

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


}