package behavioral.visitor

class AWP(name: String) : Weapon(name) {
    override fun accept(visitor: Visitor): Int {
        return visitor.getKillReward(this)
    }
}