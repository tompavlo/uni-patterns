package creational.abstractFactory

class SWAT(override val name: String,
           override val defuseKits: Boolean) : PlayerModelCT(){
    override fun attack() {
        println("😶‍🌫️😶‍🌫️")
    }
}