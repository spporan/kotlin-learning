     fun  main(){
         print("Hello world")

         val map= mapOf(1 to "One",2 to "Two",3 to "Three")

         map.forEach { (k, v) -> println("$k -> $v")}

         //map.put(4)="four" will show compile error cause mapOf() immutable

         val mutableMap= mutableMapOf("one" to 1,"two" to 2, "three" to 3, "four" to 4)
         mutableMap.forEach { (k, v) -> println("$k -> $v")}

         print("after add new value\n")
         mutableMap["five"] = 5
         mutableMap.forEach { (k, v) -> println("$k -> $v")}

         sayHello("Welcome", "Kotlin","Java","Dart")

         print("say hello fun call convert array to string with * \n")
         val  array= arrayOf("Kotlin","Java","Dart")
         sayHello("Welcome", *array)




     }

     fun sayHello(greetings:String, vararg  itemToGreet:String){
         itemToGreet.forEach{value ->
             println("$greetings to the $value")
         }
     }