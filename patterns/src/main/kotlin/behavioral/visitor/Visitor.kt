package behavioral.visitor

interface Visitor {
    fun getKillReward(rifle: Rifle): Int
    fun getKillReward(awp: AWP): Int
    fun getKillReward(pistol: Pistol): Int
}