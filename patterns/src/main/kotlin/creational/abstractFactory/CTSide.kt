package creational.abstractFactory

interface CTSide {
    fun summonSWAT(name: String, hasDefuseKits: Boolean): SWAT
    fun summonFBI(name: String, hasDefuseKits: Boolean): FBI
}