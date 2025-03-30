package behavioral.iterator

class HoldingInventory(
    public var mainGun: Handable,
    public var pistol: Handable,
    public var grenade: Handable
) : Inventory<Handable> {
    override fun getIterator(): InventoryIterator<Handable> {
        return HoldingIterator(this)
    }
}