package behavioral.state

class AliveState(private val player: Player) : PlayerState {
    override fun spawn() {
        println("Can't spawn alive player")
    }

    override fun kill() {
        println("Player is killed")
        player.changeState(DeadState(player))
    }
}