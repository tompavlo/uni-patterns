package creational.prototype

class PlayerStats(override val currentRound: Int,
                  private val totalKills: Int,
                  private val totalAssists: Int) : Stats {
    override fun copy(): Stats {
        return PlayerStats(currentRound, totalKills, totalAssists)
    }
}