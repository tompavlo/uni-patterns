package behavioral.iterator

interface InventoryIterator<T> {
    fun isDone(): Boolean
    fun next()
    fun current() : T
}