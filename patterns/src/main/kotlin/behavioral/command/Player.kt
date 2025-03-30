package behavioral.command

data class Player(var money: Int, val inventory: MutableList<String> = mutableListOf())