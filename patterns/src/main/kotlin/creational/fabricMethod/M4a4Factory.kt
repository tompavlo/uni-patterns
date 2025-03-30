package creational.fabricMethod

class M4a4Factory(private val damage: Int, private val price: Int) : WeaponFactory {
    override fun createWeapon(): Weapon {
       return M4a4(damage, price)
    }
}