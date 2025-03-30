package behavioral.command

class BuyWeaponCommand(
    private val player: Player,
    private val price: Int,
    private val name: String
) : Command {

    override fun execute() {
        if(player.money>=price){
            player.inventory.add(name)
            player.money -= price
        }
    }

    override fun undo() {
        if(player.inventory.contains(name)){
            player.inventory.remove(name)
            player.money+= price
        }
    }
}