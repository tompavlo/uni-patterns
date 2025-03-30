package behavioral.strategy

class GameEngine(private var gameMode: GameMode) {
    fun changeGameMode(gameMode: GameMode){
        this.gameMode = gameMode
    }

    fun startGame(){
        this.gameMode.spawnPlayers()
        this.gameMode.setMoney()
        this.gameMode.setHp()
        this.gameMode.setInventory()
    }
}