package creational.abstractFactory

abstract class PlayerModelTerrorists : PlayerModel() {
    override val team: String = "T"
    abstract val bomb: Boolean
}