package fabricMethod

class Shop(private val intent: WeaponFactory) {
    private val weapon: Weapon = intent.createWeapon()

    fun getWeapon(): Weapon{
        return weapon
    }
}