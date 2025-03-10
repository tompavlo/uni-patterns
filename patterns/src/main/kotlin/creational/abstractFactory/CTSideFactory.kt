package creational.abstractFactory

class CTSideFactory : CTSide {
    override fun summonSWAT(name: String, hasDefuseKits: Boolean): SWAT {
        return SWAT(name, hasDefuseKits)
    }

    override fun summonFBI(name: String, hasDefuseKits: Boolean): FBI {
        return FBI(name, hasDefuseKits)
    }
}