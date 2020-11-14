open class BasicCarInfo {
  open   var color:String="Blue"
    lateinit var modelName:String
    protected open lateinit var engineType:String

    open fun start(){

    }

   open fun stop(){

    }
}

class  FancyCar : BasicCarInfo() {
    override var color: String
        get() ="Red"
        set(value) {

        }

    override var engineType: String
        get() = "Fuel injection"
        set(value) {}

    override fun start() {
        super.start()

        println("Start walton WMW")
    }

}

fun main() {
    val fancyCarInfo=FancyCar()
        fancyCarInfo.start()
    println(fancyCarInfo.color)
}