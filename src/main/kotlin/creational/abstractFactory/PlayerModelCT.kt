package creational.abstractFactory

abstract class PlayerModelCT : PlayerModel() {
    abstract val defuseKits: Boolean
    override val team: String = "CT"
}