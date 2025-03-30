package behavioral.visitor

class Rifle(name: String) : Weapon(name) {
    override fun accept(visitor: Visitor): Int {
        return visitor.getKillReward(this)
    }
}