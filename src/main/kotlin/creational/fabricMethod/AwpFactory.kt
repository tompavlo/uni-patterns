package creational.fabricMethod

class AwpFactory(private val price: Int, private val damage: Int) : WeaponFactory {
    override fun createWeapon(): Weapon {
        return Awp(price, damage)
    }
}