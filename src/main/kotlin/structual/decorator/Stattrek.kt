package structual.decorator

class Stattrek(weapon: Weapon) : WeaponDecorator(weapon) {
    override fun display() {
        weapon.display()
        println("Kill count: 752")
    }
}