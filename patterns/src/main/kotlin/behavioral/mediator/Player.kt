package behavioral.mediator

class Player(public val team: String, private val mediator: ChatMediator) {
    init {
        mediator.addPlayer(this)
    }

    fun sendMessageAll(message: String){
        mediator.messageAll(message)
    }

    fun sendMessageToTeammates(message: String){
        mediator.messageTeammates(message, this)
    }
}