package behavioral.memento

class PlayerState(
    var health: Int,
    var money: Int,
    var x: Int,
    var y: Int,
    var z: Int,
) {
    fun moveTo(newX: Int, newY: Int, newZ: Int){
        x = newX
        y = newY
        z = newZ
    }

    fun takeDamage(damage: Int){
        health=(health - damage).coerceAtLeast(0)
    }

    fun saveState() : PlayerStateMemento{
        return PlayerStateMemento(health, money, x, y, z)
    }

    fun restoreState(playerStateMemento: PlayerStateMemento){
        health = playerStateMemento.health
        money = playerStateMemento.money
        x = playerStateMemento.x
        y = playerStateMemento.y
        z = playerStateMemento.z
    }
}