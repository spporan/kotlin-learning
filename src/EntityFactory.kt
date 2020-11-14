import java.util.*

interface IdProvider{
    fun getId():String
}

enum class EntityType{
    Easy,Medium,Hard;
    fun formattedName()=name.capitalize()
    fun toLow()=name.toLowerCase()
    fun toUp()=name.toUpperCase()

}

object  EntityFactory{
    fun create(type:EntityType):Entity{
        val id=UUID.randomUUID().toString()
        val  name=when(type){
            EntityType.Easy-> type.formattedName()
            EntityType.Medium-> type.toLow()
            EntityType.Hard->type.toUp()
        }
        return  Entity(id,name)
    }
}
class  Entity (private val id:String, private val name:String){

    fun created(){
        println("Created factory")

    }

    override fun toString(): String {
        return "Your id is $id  and type $name"
    }

}

fun main() {
    var easy=EntityFactory.create(EntityType.Easy)
    var medium=EntityFactory.create(EntityType.Medium)
    var hard=EntityFactory.create(EntityType.Hard)

    //  entityFact.created()
    println(easy)
    println(medium)
    println(hard)


}