package creational.prototype

interface Stats {
    abstract val currentRound: Int
    abstract fun copy(): Stats
}