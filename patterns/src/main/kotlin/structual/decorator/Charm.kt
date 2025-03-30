package structual.decorator

class Charm(weapon: Weapon) : WeaponDecorator(weapon) {
    override fun display() {
        weapon.display()
        println("Displaying charm for this weapon")
    }
}