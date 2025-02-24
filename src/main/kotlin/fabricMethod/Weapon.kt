package fabricMethod

abstract class Weapon {
    abstract val name: String
    abstract val damage: Int
    abstract val price: Int

    abstract fun shoot()

}