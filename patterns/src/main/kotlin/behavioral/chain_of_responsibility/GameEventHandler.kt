package behavioral.chain_of_responsibility

interface GameEventHandler {
    var nextHandler: GameEventHandler?
    fun setNextGameEventHandler(gameEventHandler: GameEventHandler)
    fun handleEvent(event: GameEvents)
}