package behavioral.strategy_revisited

class Scoreboard(private val players: List<Player>) {
    fun showScoreboard(selector: (player: Player) -> Int){
        println(players.sortedByDescending { selector(it) })
    }
}