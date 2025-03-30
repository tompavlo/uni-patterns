package creational.builder

class PlayerInventory private constructor(val money: Int, val totalGrenades: Int) {

    private constructor(builder: PlayerInventoryBuilder): this(builder.money, builder.totalGrenades)

    class PlayerInventoryBuilder{
        var money: Int = 0
            private set
        var totalGrenades = 0
            private set

        fun money(money: Int)= apply { this.money = money }

        fun totalGrenades(totalGrenades: Int)= apply { this.totalGrenades = totalGrenades }

        fun build() = creational.builder.PlayerInventory(this)
    }

    fun showMoney(){
        println("$money $")
    }

    fun showGrenades(){
        println("total grenades: $totalGrenades")
    }
}