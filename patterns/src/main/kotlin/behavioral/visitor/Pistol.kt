package behavioral.visitor

class Pistol(name: String) : Weapon(name) {
    override fun accept(visitor: Visitor): Int {
        return visitor.getKillReward(this)
    }
}