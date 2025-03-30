package behavioral.observer

interface Observable {
    fun add(observer: Observer)
    fun remove(observer: Observer)
    suspend fun notify()
}