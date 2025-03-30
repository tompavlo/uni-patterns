package behavioral.iterator

interface Inventory<T> {
    fun getIterator(): InventoryIterator<T>
}