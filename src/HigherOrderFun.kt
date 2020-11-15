
 fun printFilteredString(list:List<String?>,predicate:((String)->Boolean)?){
    list.forEach {
        if(it?.let { it1 -> predicate?.invoke(it1) } ==true){
            println(it)
        }

    }
}
fun predicateFun():(String)->Boolean={it.startsWith("K")}
 val predicate:(String)->Boolean={it.toLowerCase().startsWith("d")}
 fun main(){
    val  list= listOf<String?>("Katlin","Java","Dart","Javascript","Jquery","D",null,null)
     val lang=list.filterNotNull().findLast{ it.toLowerCase().startsWith("j") }
     println("lang $lang")
     list.filterNotNull().filter { it.startsWith("J") }.associateWith { it.length }.forEach { println("${it.key} <> ${it.value}") }
    printFilteredString(list) {it.toLowerCase().startsWith("j")}
     printFilteredString(list,predicate)
     printFilteredString(list,predicateFun()
     )

}