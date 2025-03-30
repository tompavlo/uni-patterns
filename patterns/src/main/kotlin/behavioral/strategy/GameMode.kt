package behavioral.strategy

interface GameMode {
    fun spawnPlayers()

    fun setHp()

    fun setInventory()

    fun setMoney()
}