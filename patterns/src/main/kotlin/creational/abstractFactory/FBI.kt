package creational.abstractFactory

class FBI(override val name: String,
          override val defuseKits: Boolean) : PlayerModelCT() {
    override fun attack() {
        println("💪😎")
    }
}