package behavioral.chain_of_responsibility

class BombPlantedEvent : GameEventHandler {
    override var nextHandler: GameEventHandler? = null

    override fun setNextGameEventHandler(gameEventHandler: GameEventHandler) {
        this.nextHandler = gameEventHandler
    }

    override fun handleEvent(event: GameEvents) {
        if (GameEvents.BOMB_PLANTED == event) {
            println("Bomb is planted! Round time will be change to 00:45 ")
        }
        else nextHandler?.handleEvent(event)
    }
}