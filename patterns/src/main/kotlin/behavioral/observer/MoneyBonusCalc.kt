package behavioral.observer

const val DEFAULT_LOSS_BONUS = 1400
const val DEFAULT_WIN_BONUS = 3250

class MoneyBonusCalc(private val roundEngine: RoundEngine) : Observer {
    var ctLossStreak = 0
    var tLossStreak = 0

    var previousWonCtRound = 0
    var previousWonTRound = 0

    override fun update() {
        if(roundEngine.getCtRound() + roundEngine.getTerroristRound() == 12){
            ctLossStreak = 0
            tLossStreak = 0
            return
        }
        if(previousWonTRound<roundEngine.getTerroristRound()){
            calculateMoneyForCT(ctWon = false)
            calculateMoneyForT(tWon = true)
            if(ctLossStreak<4) ctLossStreak++
        }
        else{
            calculateMoneyForCT(ctWon = true)
            calculateMoneyForT(tWon = false)
            if(tLossStreak<4) tLossStreak++
        }

    }

    fun calculateMoneyForCT(ctWon: Boolean): Int{
        return if(ctWon) DEFAULT_WIN_BONUS
        else {
            DEFAULT_LOSS_BONUS + 500 * ctLossStreak
        }
    }

    fun calculateMoneyForT(tWon: Boolean) : Int{
        return if(tWon) DEFAULT_WIN_BONUS
        else {
            DEFAULT_LOSS_BONUS + 500 * tLossStreak
        }

    }


}