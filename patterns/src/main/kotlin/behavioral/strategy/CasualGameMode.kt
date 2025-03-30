package behavioral.strategy

class CasualGameMode : GameMode {
    override fun spawnPlayers() {
        repeat(20) {
            println("Spawned player")
        }
    }

    override fun setHp() {
        println("Set 100 hp for each")
    }

    override fun setInventory() {
        println("Set kevlar + helmet and default pistol for everyone")
    }

    override fun setMoney() {
        println("Set default amount of money for casual")
    }
}