
interface IdProvider{
    fun getId():String
}

object  EntityFactory{
    fun create()=Entity("id1202")
}
class  Entity (val id:String){
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

    override fun toString(): String {
        return "Your id is $id"
    }

}

fun main() {
    var entity=Entity.create()
    var entityFact=EntityFactory.create()
  //  entityFact.created()
    println(entityFact)


}