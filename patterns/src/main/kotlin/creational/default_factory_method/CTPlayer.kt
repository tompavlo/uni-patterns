package creational.default_factory_method

class CTPlayer(private val gun: Gun) : Player {
    override fun getGun(): Gun {
        return gun
    }
}