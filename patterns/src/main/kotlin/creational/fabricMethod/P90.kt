package creational.fabricMethod

class P90(override val damage: Int, override val price: Int) : Weapon() {
    override val name: String = "P90"

    override fun shoot() {
        println("Trrraaaa")
    }
}