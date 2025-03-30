package behavioral.visitor

abstract class Weapon internal constructor(internal val name: String) : Visitable {
    val defaultKillReward = 300

}