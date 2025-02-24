package fabricMethod

class P90Factory(private val damage: Int, private val price: Int) : WeaponFactory {
    override fun createWeapon(): Weapon {
        return P90(damage, price)
    }
}