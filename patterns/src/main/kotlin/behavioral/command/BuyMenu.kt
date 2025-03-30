package behavioral.command

class BuyMenu {
    private val commands: MutableMap<String, Command> = mutableMapOf()
    private var lastCommand: Command? = null

    fun registerWeapon(nameOfWeapon: String, command: Command){
        commands[nameOfWeapon] = command
    }

    fun buyWeapon(name: String){
        commands[name]?.execute()
        lastCommand=commands[name]
    }

    fun returnButton(){
        lastCommand?.undo()
    }
}