package behavioral.template

abstract class BuysTemplate {
    fun makeBuy(): String {
        return chooseMainGun() + " " + chooseGrenades() + " " + choosePistol()
    }

    abstract fun chooseMainGun(): String
    abstract fun choosePistol(): String
    abstract fun chooseGrenades(): String

}