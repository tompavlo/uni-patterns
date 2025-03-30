package structual.facade

class ConsoleFacade(private val console: Console) {
    fun execOutput(message: Message){
        console.open()
        console.write(message)
        console.close()
    }
}