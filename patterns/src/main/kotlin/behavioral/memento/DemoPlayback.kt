package behavioral.memento

class DemoPlayback {
    private val tick: MutableList<PlayerStateMemento> = mutableListOf()

    fun addTick(playerStateMemento: PlayerStateMemento) {
        tick.add(playerStateMemento)
    }

    fun getMemento(index: Int): PlayerStateMemento? {
        return tick.getOrNull(index)

    }

    fun restoreMemento(index: Int,caller: PlayerState){
        val memento = getMemento(index)
        if(memento!=null){
            caller.restoreState(memento)
        }
    }
}