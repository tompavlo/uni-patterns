package behavioral.template

class AwpDefaultBuy : BuysTemplate() {
    override fun chooseMainGun(): String {
        return "AWP"
    }

    override fun choosePistol(): String {
        return "Default pistol"
    }

    override fun chooseGrenades(): String {
        return "Flash, smoke, HE, fire"
    }
}