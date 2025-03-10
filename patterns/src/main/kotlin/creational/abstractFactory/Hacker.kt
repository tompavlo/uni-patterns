package creational.abstractFactory

class Hacker(override val name: String,
             override val bomb: Boolean) : PlayerModelTerrorists() {
    override fun attack() {
        println("💻😊")
    }
}