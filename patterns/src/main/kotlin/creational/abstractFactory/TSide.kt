package creational.abstractFactory

interface TSide {
    fun summonTerrorist(name: String, hasBomb: Boolean): Terrorist
    fun summonHacker(name: String, hasBomb: Boolean): Hacker
}