package behavioral.iterator

import java.lang.IndexOutOfBoundsException

class HoldingIterator(private val holdingInventory: HoldingInventory) : InventoryIterator<Handable> {
    var index = 0
    override fun isDone(): Boolean {
        return index > 2
    }

    override fun next() {
        index++
    }

    override fun current(): Handable {
       return when (index) {
            0 -> holdingInventory.mainGun
            1 -> holdingInventory.pistol
            2 -> holdingInventory.grenade
            else -> {
                throw IndexOutOfBoundsException()
            }
        }
    }
}