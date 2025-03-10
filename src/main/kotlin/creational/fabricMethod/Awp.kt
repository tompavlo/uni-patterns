package creational.fabricMethod

class Awp(override val price: Int, override val damage: Int) : Weapon() {
    override val name: String = "AWP"

    override fun shoot() {
        println("Pum")
    }

}