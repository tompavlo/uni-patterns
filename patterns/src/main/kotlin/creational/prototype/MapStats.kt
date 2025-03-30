package creational.prototype

class MapStats(override val currentRound: Int,
               private val currentMap: String,
               private val totalPlayers: Int) : Stats {
    override fun copy(): Stats {
        return MapStats(currentRound, currentMap, totalPlayers)
    }
}