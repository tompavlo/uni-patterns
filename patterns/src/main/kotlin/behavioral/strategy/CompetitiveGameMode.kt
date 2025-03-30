package behavioral.strategy

class CompetitiveGameMode : GameMode {
    override fun spawnPlayers() {
        repeat(10){
            println("Spawned player")
        }
    }

    override fun setHp() {
        println("Set HP of everyone to 100")
    }

    override fun setInventory() {
        println("Default pistol for everyone")
    }

    override fun setMoney() {
        println("800$ for everyone")
    }
}