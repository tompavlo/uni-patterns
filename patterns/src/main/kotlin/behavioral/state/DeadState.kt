package behavioral.state

class DeadState(private val player: Player) : PlayerState{
    override fun spawn() {
        println("Player is spawned")
        player.changeState(AliveState(player))
    }

    override fun kill() {
        println("Cant kill dead player")
    }
}