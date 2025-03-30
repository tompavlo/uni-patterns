package behavioral.observer

class UiRoundBox(private val roundEngine: RoundEngine) : Observer {
    override fun update() {
        println("CT - " + roundEngine.getCtRound())
        println("T - " + roundEngine.getTerroristRound())
        println()
    }
}