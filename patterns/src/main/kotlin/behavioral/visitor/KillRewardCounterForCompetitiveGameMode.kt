package behavioral.visitor

class KillRewardCounterForCompetitiveGameMode : Visitor  {
    override fun getKillReward(rifle: Rifle): Int {
        return rifle.defaultKillReward
    }

    override fun getKillReward(awp: AWP): Int {
        return awp.defaultKillReward / 3
    }

    override fun getKillReward(pistol: Pistol): Int {
        return pistol.defaultKillReward + 100
    }
}