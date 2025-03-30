package behavioral.visitor

interface Visitable {
    fun accept(visitor: Visitor): Int
}