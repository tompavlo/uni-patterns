package behavioral.chain_of_responsibility

class TeamTimeoutEvent : GameEventHandler {
    override var nextHandler: GameEventHandler? = null
    override fun setNextGameEventHandler(gameEventHandler: GameEventHandler) {
        nextHandler = gameEventHandler
    }

    override fun handleEvent(event: GameEvents) {
        if(event == GameEvents.TEAM_TIMEOUT){
            println("Pause for 60 seconds")
        }
        else nextHandler?.handleEvent(event)
    }
}