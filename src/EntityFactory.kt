import java.util.*

interface IdProvider{
    fun getId():String
}

enum class EntityType{
    Easy,Medium,Hard,Help;
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
            EntityType.Help -> type.toUp()
        }
        return  when(type){
            EntityType.Easy -> Entity.Easy(id,name)
            EntityType.Medium -> Entity.Medium(id,name)
            EntityType.Hard -> Entity.Hard(id,name,2f)
            EntityType.Help -> Entity.Help
        }
    }
}
sealed class  Entity (){
    object Help:Entity(){
        val  name="Help"

    }

    data class Easy(val id:String,val name:String):Entity()
    data class Medium(val id:String,val name: String):Entity()
    data class Hard(val id: String,val name: String,val multiplier:Float):Entity()

}

fun main() {
    val easy=EntityFactory.create(EntityType.Easy)
    val medium=EntityFactory.create(EntityType.Medium)
    val hard=EntityFactory.create(EntityType.Hard)

    //  entityFact.created()
    val mess=when(easy){
        Entity.Help -> "Help class"
        is Entity.Easy ->"Easy property id ${easy.id }  name ${easy.name}"
        is Entity.Medium -> "Medium class"
        is Entity.Hard -> "Hard class"
    }
    println(mess)
    println(medium)
    println(hard)

    val ent1=Entity.Easy("12","poran")
    val ent2=ent1.copy(id = "13")
    if(ent1 == ent2){
        println("They are equality")
    }else{
        println("They not are equality")

    }

}