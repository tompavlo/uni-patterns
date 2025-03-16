package structual.bridge

class T(weapon: Weapon) : PlayerMeinMenuModel(weapon) {

    override fun doTrick() {
        weapon.doCrazyTrick()
    }

    override fun attack() {
        weapon.attack()
    }
}