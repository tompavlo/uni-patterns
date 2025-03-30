package behavioral.memento

data class PlayerStateMemento(
    val health: Int,
    val money: Int,
    val x: Int,
    val y: Int,
    val z: Int,
)