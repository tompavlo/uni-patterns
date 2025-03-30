package behavioral.chain_of_responsibility

class BombDefusedEvent : GameEventHandler {
    override var nextHandler: GameEventHandler? = null

    override fun setNextGameEventHandler(gameEventHandler: GameEventHandler) {
        nextHandler = gameEventHandler
    }

    override fun handleEvent(event: GameEvents) {
        if (event == GameEvents.BOMB_DEFUSED) {
            println("Bomb is defused! Round finished")
        }
        else nextHandler?.handleEvent(event)
    }
}