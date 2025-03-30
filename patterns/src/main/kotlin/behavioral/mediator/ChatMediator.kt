package behavioral.mediator

class ChatMediator {
   val players: MutableList<Player> = mutableListOf()

    fun addPlayer(player: Player){
        players.add(player)
    }

    fun messageTeammates(message: String, sender: Player){
        players.forEach {if(sender.team== it.team)
            println(message)
        }
    }

    fun messageAll(message: String){
        players.forEach { _ -> println(message) }
    }
}