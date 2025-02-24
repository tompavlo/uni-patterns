package abstractFactory

class Terrorist(override val name: String,
                override val bomb: Boolean) : PlayerModelTerrorists() {
    override fun attack() {
        println("🤯🤯")
    }
}