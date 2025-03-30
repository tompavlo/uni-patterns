package behavioral.state

class Player {
    private var state: PlayerState = DeadState(this)

    fun getSpawned(){
        state.spawn()
    }

    fun getKilled(){
        state.kill()
    }

    fun changeState(state: PlayerState){
        this.state = state
    }

}