package creational.default_factory_method

interface Player {
    fun getGun(): Gun

    fun makeDamage(){
        println("Damaged on " + getGun().damage)
    }
}