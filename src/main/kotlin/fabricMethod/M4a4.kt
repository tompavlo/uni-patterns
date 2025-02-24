package fabricMethod

class M4a4(override val damage: Int, override val price: Int) : Weapon() {
    
    override val name: String = "M4A4"

    override fun shoot() {
        println("Pew-pew")
    }
}