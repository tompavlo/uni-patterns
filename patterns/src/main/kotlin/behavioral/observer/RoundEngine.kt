package behavioral.observer

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RoundEngine : Observable {
    private val observers: ArrayList<Observer> = arrayListOf()

    private var ctRoundWon = 0

    private var terroristRoundWon = 0

    override fun add(observer: Observer) {
        observers.add(observer)
    }

    override fun remove(observer: Observer) {
        observers.remove(observer)
    }

    override suspend fun notify() {
        coroutineScope {
            observers.forEach { observer ->
                launch { observer.update() }
            }
        }
    }

    fun getCtRound() = ctRoundWon

    fun getTerroristRound() = terroristRoundWon

    suspend fun work() {
        while(ctRoundWon < 13 && terroristRoundWon < 13 && (ctRoundWon + terroristRoundWon) < 24) {
            val ctWon = kotlin.random.Random.nextBoolean()
            if(ctWon) ctRoundWon++
            else terroristRoundWon++
            notify()
            delay(500)
        }
        if(ctRoundWon == 13 ) println("CT WON!!!🥳🥳")
        else if (terroristRoundWon == 13 ) println("T WON!!!")
        else println("DRAW!")
    }
}