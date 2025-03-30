package structual.decorator

class Skin(weapon: Weapon) : WeaponDecorator(weapon) {
    override fun display() {
        weapon.display()
        println("Displaying skin")
    }
}