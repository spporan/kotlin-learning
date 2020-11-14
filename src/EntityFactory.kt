
interface IdProvider{
    fun getId():String
}
class  Entity private constructor(val id:String){
    companion object:IdProvider{
        private const val id="Id"
        fun create(){
            this.getId()
            Entity(id = getId())}
        override fun getId() :String{
            println("Your id $id")
            return "Your id $id"
        }
    }

    fun created(){
        println("Created factory")

    }

}

fun main() {
    var entity=Entity.create()


}