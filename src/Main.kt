     fun  main(){
var person=Person("Shah","Poran",23)
         var p=Person()

         print("first name : ${p.firstName} lastName  :${p.lastName}")





     }

     fun sayHello(greetings:String, vararg  itemToGreet:String){
         itemToGreet.forEach{value ->
             println("$greetings to the $value")
         }
     }