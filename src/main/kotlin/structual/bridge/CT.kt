package structual.bridge

class CT(weapon: Weapon) : PlayerMeinMenuModel(weapon) {
    override fun doTrick() {
        weapon.doTrick()
    }

    override fun attack() {
        weapon.attack()
    }

}