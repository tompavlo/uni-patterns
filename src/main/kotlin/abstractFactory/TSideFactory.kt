package abstractFactory

class TSideFactory : TSide {
    override fun summonTerrorist(name: String, hasBomb: Boolean): Terrorist {
        return Terrorist(name, hasBomb)
    }

    override fun summonHacker(name: String, hasBomb: Boolean): Hacker {
        return Hacker(name, hasBomb)
    }
}