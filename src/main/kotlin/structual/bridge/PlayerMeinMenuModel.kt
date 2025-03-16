package structual.bridge

abstract class PlayerMeinMenuModel protected constructor(protected var weapon: Weapon) {
    abstract fun doTrick()
    abstract fun attack()


}