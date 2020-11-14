     fun  main(){
var person=Person("Shah","Poran",23)
         person.personInfo()

         person.nickName="poran"
         person.birthDate="01-04-1997"
         print("nick name : ${person.nickName} birthDate  :${person.birthDate}\n")

         person.personInfo()





     }

     fun sayHello(greetings:String, vararg  itemToGreet:String){
         itemToGreet.forEach{value ->
             println("$greetings to the $value")
         }
     }