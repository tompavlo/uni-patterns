package creational.abstractFactory

abstract class PlayerModel {
    val hp: Int = 100
    abstract val name: String
    abstract val team: String

    abstract fun attack()
}