package behavioral.chain_of_responsibility

class ConnectionTimeoutEvent : GameEventHandler {
    override var nextHandler: GameEventHandler? = null
    override fun setNextGameEventHandler(gameEventHandler: GameEventHandler) {
        nextHandler = gameEventHandler
    }

    override fun handleEvent(event: GameEvents) {
        if(event == GameEvents.CONNECTION_TIMEOUT){
            println("Game is paused for 2 minutes")
        }
        else nextHandler?.handleEvent(event)
    }
}