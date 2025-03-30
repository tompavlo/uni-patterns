package behavioral.template

class FullRifleBuyTemplate : BuysTemplate() {
    override fun chooseMainGun(): String {
       return "Main rifle"
    }

    override fun choosePistol(): String {
        return "Default pistol"
    }

    override fun chooseGrenades(): String {
        return "Smoke, flash, HE, fire"
    }
}